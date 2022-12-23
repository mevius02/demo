package com.example.demo.service.common;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.example.demo.common.GlobalVariable;
import com.example.demo.mapper.ApiRoleMapper;
import com.example.demo.mapper.mybatis.MUserDetailMapper;
import com.example.demo.model.mybatis.MUserDetail;

@Service
@Transactional
public class CommonService extends GlobalVariable {

    @Autowired
    private DropdownService dropdownService;
    @Autowired
    private MUserDetailMapper mUserDetailMapper;
    @Autowired
    private ApiRoleMapper apiRoleMapper;

    public String getSystemThema(String userId) {
        MUserDetail userDetail = mUserDetailMapper.selectByPrimaryKey(userId);
        if (userDetail != null) {
            return userDetail.getSystemThemaCd();
        }
        return "simple";
    }

    public void setDropdownInModel(Model model, String roleCd) {
        model.addAttribute("mstMenuList", dropdownService.getRoleMstMenuList(roleCd));
        model.addAttribute("systemThemaList", dropdownService.getSystemThemaList());
    }

    public int calcAge(Date dateOfBirth) {
        Calendar calendarBirth = Calendar.getInstance();
        Calendar calendarNow = Calendar.getInstance();

        calendarBirth.setTime(dateOfBirth);
        calendarNow.setTime(new Date());

        // （現在年ー生まれ年）で年齢の計算
        int age = calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR);
        // 誕生月を迎えていなければ年齢-1
        if (calendarNow.get(Calendar.MONTH) < calendarBirth.get(Calendar.MONTH)) {
            age -= 1;
        } else if (calendarNow.get(Calendar.MONTH) == calendarBirth.get(Calendar.MONTH)) {
            // 誕生月は迎えているが、誕生日を迎えていなければ年齢−１
            if (calendarNow.get(Calendar.DATE) < calendarBirth.get(Calendar.DATE)) {
                age -= 1;
            }
        }
        return age;
    }

    public String[] getApiRoleList(String apiCd) {
        List<String> apiRoleList = apiRoleMapper.selectApiRoleList(apiCd);
        String[] resultList = new String[apiRoleList.size()];
        if (resultList != null) {
            for (int i = 0; i < apiRoleList.size(); i++) {
                resultList[i] = apiRoleList.get(i);
            }
        }
        return resultList;
    }
}
