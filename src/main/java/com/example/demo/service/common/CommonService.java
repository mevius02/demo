package com.example.demo.service.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapper.mybatis.MUserDetailMapper;
import com.example.demo.model.mybatis.MUserDetail;

@Service
@Transactional
public class CommonService {

    @Autowired
    MUserDetailMapper mUserDetailMapper;

    public String getSystemThema(String userId) {
        MUserDetail userDetail = mUserDetailMapper.selectByPrimaryKey(userId);
        if (userDetail != null) {
            return userDetail.getSystemThemaCd();
        }
        return "default";
    }
}
