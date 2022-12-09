package com.example.demo.service.common;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.GlobalVariable;
import com.example.demo.mapper.mybatis.MSystemThemaMapper;
import com.example.demo.model.common.GenericRecord;
import com.example.demo.model.mybatis.MSystemThema;
import com.example.demo.model.mybatis.MSystemThemaExample;

@Service
@Transactional
public class DropdownService extends GlobalVariable {

    @Autowired
    MSystemThemaMapper mSystemThemaMapper;

    public List<GenericRecord> getSystemThemaList() {
        MSystemThemaExample example = new MSystemThemaExample();
        example.createCriteria().andEnabledEqualTo(true);
        example.setOrderByClause("order_no, system_thema_cd");
        List<MSystemThema> systemThemalist = mSystemThemaMapper.selectByExample(example);
        List<GenericRecord> list = new ArrayList<>();
        for (MSystemThema systemThemaRecord : systemThemalist) {
            GenericRecord record = new GenericRecord();
            record.setCd(systemThemaRecord.getSystemThemaCd());
            record.setNm(systemThemaRecord.getSystemThemaNm());
            list.add(record);
        }
        return list;
    }
}
