package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.AccountForm;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.mapper.mybatis.MUserMapper;
import com.example.demo.model.Account;
import com.example.demo.model.mybatis.MUser;

@Service
@Transactional
public class AccountService extends GlobalVariable {

    @Autowired
    MUserMapper mUserMapper;
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    public Account selectMyAccount(String userId) {
        return accountMapper.selectMyAccount(userId);
    }

    public void formErrorCheckMyAccount(String usertId, AccountForm accountForm, BindingResult result) {
        String dbPassword = mUserMapper.selectByPrimaryKey(usertId).getPassword();
        boolean isCurPass = StringUtils.isEmpty(accountForm.getAccount().getCurrentPassword());
        boolean isNewPass = StringUtils.isEmpty(accountForm.getAccount().getNewPassword());
        boolean isConPass = StringUtils.isEmpty(accountForm.getAccount().getNewPasswordConfirmation());
        boolean isAllEmpty = isCurPass && isNewPass && isConPass;
        boolean isAllNotEmpty = !isCurPass && !isNewPass && !isConPass;
        // [現在],[新規],[新規確認用]パスワードが全て入力有の場合
        if (isAllNotEmpty) {
            if (!passwordEncoder.matches(accountForm.getAccount().getCurrentPassword(), dbPassword)) {
                FieldError fieldError = new FieldError(result.getObjectName(), "account.currentPassword",
                        "登録されているパスワードと一致しません");
                result.addError(fieldError);
            }
            if (StringUtils.equals(accountForm.getAccount().getCurrentPassword(),
                    accountForm.getAccount().getNewPassword())) {
                FieldError fieldError = new FieldError(result.getObjectName(), "account.newPassword",
                        "現在パスワードと同じにする事は出来ません");
                result.addError(fieldError);
            }
            if (accountForm.getAccount().getNewPassword().length() < 8) {
                FieldError fieldError = new FieldError(result.getObjectName(), "account.newPassword",
                        "パスワードは8文字以上で入力して下さい");
                result.addError(fieldError);
            }
            if (!StringUtils.equals(accountForm.getAccount().getNewPassword(),
                    accountForm.getAccount().getNewPasswordConfirmation())) {
                FieldError fieldError = new FieldError(result.getObjectName(), "account.newPasswordConfirmation",
                        "新規パスワードと一致しません");
                result.addError(fieldError);
            }
        }
        // [現在],[新規],[新規確認用]パスワードのいずれかのみ入力有の場合
        if (!isAllEmpty && !isAllNotEmpty) {
            FieldError fieldError = new FieldError(result.getObjectName(), "account.currentPassword",
                    "パスワードを変更する場合 [現在],[新規],[新規確認用] の3か所、全て入力して下さい");
            result.addError(fieldError);
        }
    }

    public String updateMyAccount(String usertId, AccountForm accountForm) {
        // [更新] Mユーザー
        MUser mUser = new MUser();
        mUser.setUserNm(accountForm.getAccount().getUserNm());
        if (!StringUtils.isEmpty(accountForm.getAccount().getNewPassword())) {
            mUser.setPassword(passwordEncoder.encode(accountForm.getAccount().getNewPassword()));
        }
        mUser.setUserId(accountForm.getAccount().getUserId());
        mUser.setUserNm(accountForm.getAccount().getUserNm());
        // mUser.setMailAddress(StringUtils.isEmpty(accountForm.getMailAddress()) ? null
        // : accountForm.getMailAddress());
        // mUser.setSystemThemaCd(accountForm.getSystemThemaCd());
        mUser.setUpdateUserId(usertId);
        mUser.setUpdateTimestamp(new Date());
        if (1 != accountMapper.updateMyAccount(mUser)) {
            return RETURN_FAILURE;
        }
        // [更新] Mユーザー詳細
        return RETURN_SUCCESS;
    }
}
