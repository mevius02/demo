package com.example.demo.service.mst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.util.StringUtils;

import com.example.demo.common.GlobalVariable;
import com.example.demo.form.mst.user.SearchConditionForm;
import com.example.demo.mapper.mybatis.MUserMapper;
import com.example.demo.model.mybatis.MUser;
import com.example.demo.model.mybatis.MUserExample;
import com.example.demo.model.mybatis.MUserExample.Criteria;

@Service
@Transactional
public class UserService extends GlobalVariable {

    @Autowired
    MUserMapper mUserMapper;

    public List<MUser> selectMUser(SearchConditionForm searchConditionForm) {
        MUserExample example = new MUserExample();
        Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(searchConditionForm.getUserId())) {
            criteria.andUserIdLike('%' + searchConditionForm.getUserId() + '%');
        }
        example.setOrderByClause("user_id");
        return mUserMapper.selectByExample(example);
    }
}
