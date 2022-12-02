package com.example.demo.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.example.demo.mapper.mybatis.MUserDetailMapper;
import com.example.demo.model.mybatis.MUserDetail;

@Service
@Transactional
public class CommonService {

    @Autowired
    private DropdownService dropdownService;
    @Autowired
    private MUserDetailMapper mUserDetailMapper;

    public String getSystemThema(String userId) {
        MUserDetail userDetail = mUserDetailMapper.selectByPrimaryKey(userId);
        if (userDetail != null) {
            return userDetail.getSystemThemaCd();
        }
        return "simple";
    }

    public void setTheDropdownInTheModel(Model model) {
        model.addAttribute("roleList", dropdownService.getRoleList());
        model.addAttribute("systemThemaList", dropdownService.getSystemThemaList());
    }
}
