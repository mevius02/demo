package com.example.demo.service.mst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.GlobalVariable;
import com.example.demo.mapper.mybatis.MSystemThemaMapper;
import com.example.demo.model.mybatis.MSystemThema;

@Service
@Transactional
public class SystemThemaService extends GlobalVariable {

    @Autowired
    MSystemThemaMapper mSystemThemaMapper;

    public String selectSystemThemaNmByPrimaryKey(String systemThemaCd) {
        MSystemThema record = mSystemThemaMapper.selectByPrimaryKey(systemThemaCd);
        if (record != null) {
            return record.getSystemThemaNm();
        }
        return null;
    }
}
