package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.GlobalVariable;
import com.example.demo.mapper.mybatis.MUserMapper;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.model.mybatis.MUserExample;

@Service
@Transactional
public class UserService extends GlobalVariable {

    @Autowired
    MUserMapper mUserMapper;

    public List<MUser> selectMUser() {
        return mUserMapper.selectByExample(new MUserExample());
    }
}
