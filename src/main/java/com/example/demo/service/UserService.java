package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.AccountForm;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.mybatis.MUserMapper;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.model.mybatis.MUserExample;

@Service
@Transactional
public class UserService extends GlobalVariable {

    @Autowired
    MUserMapper mUserMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<MUser> selectMUser() {
        return mUserMapper.selectByExample(new MUserExample());
    }

    public MUser selectMyAccount(String userId) {
        return userMapper.selectMyAccount(userId);
    }

    public String updateMyAccount(String usertId, AccountForm accountForm) {
        String dbPassword = mUserMapper.selectByPrimaryKey(usertId).getPassword();
        // ↓↓↓↓↓ エラーチェック ↓↓↓↓↓
        StringBuffer errorMsg = new StringBuffer();
        // ユーザー名
        if (StringUtils.isEmpty(accountForm.getUserNm())) {
            errorMsg.append("ユーザー名は必須入力です" + BR);
        }
        // パスワード
        boolean isCurPass = StringUtils.isEmpty(accountForm.getCurrentPassword());
        boolean isNewPass = StringUtils.isEmpty(accountForm.getNewPassword());
        boolean isConPass = StringUtils.isEmpty(accountForm.getNewPasswordConfirmation());
        boolean isAllEmpty = isCurPass && isNewPass && isCurPass;
        boolean isAllNotEmpty = !isCurPass && !isNewPass && !isCurPass;
        // [現在],[新規],[新規確認用]パスワードが全て入力有の場合
        if (isAllNotEmpty) {
            if (!passwordEncoder.matches(accountForm.getCurrentPassword(), dbPassword)) {
                errorMsg.append("現在パスワードと、登録されているパスワードが一致しません" + BR);
            }
            if (!StringUtils.equals(accountForm.getNewPassword(), accountForm.getNewPasswordConfirmation())) {
                errorMsg.append("新規パスワードと、確認用が一致しません" + BR);
            }
            if (StringUtils.equals(accountForm.getCurrentPassword(), accountForm.getNewPassword())) {
                errorMsg.append("現在パスワードと、新規パスワードを同じにする事は出来ません" + BR);
            }
            if (accountForm.getNewPassword().length() < 8) {
                errorMsg.append("パスワードは8文字以上で入力して下さい" + BR);
            }
        }
        // [現在],[新規],[新規確認用]パスワードのいずれかのみ入力有の場合
        if (!isAllEmpty && !isAllNotEmpty) {
            errorMsg.append("パスワードを変更する場合 [現在],[新規],[新規確認用] の3か所、全て入力して下さい" + BR);
        }
        // エラー有無チェック
        if (!errorMsg.isEmpty()) {
            return errorMsg.toString();
        }
        // ↑↑↑↑↑ エラーチェック ↑↑↑↑↑
        // [更新] Mユーザー
        MUser mUser = new MUser();
        mUser.setUserNm(accountForm.getUserNm());
        if (!StringUtils.isEmpty(accountForm.getNewPassword())) {
            mUser.setPassword(passwordEncoder.encode(accountForm.getNewPassword()));
        }
        mUser.setUserId(accountForm.getUserId());
        mUser.setUserNm(accountForm.getUserNm());
        // mUser.setMailAddress(StringUtils.isEmpty(accountForm.getMailAddress()) ? null
        // : accountForm.getMailAddress());
        // mUser.setSystemThemaCd(accountForm.getSystemThemaCd());
        mUser.setUpdateUserId(usertId);
        mUser.setUpdateTimestamp(new Date());
        if (1 != userMapper.updateMyAccount(mUser)) {
            return RETURN_FAILURE;
        }
        // [更新] Mユーザー詳細
        return RETURN_SUCCESS;
    }
}
