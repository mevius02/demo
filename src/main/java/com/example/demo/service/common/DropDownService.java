package com.example.demo.service.common;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.mybatis.MPrefectureMapper;
import com.example.demo.mapper.mybatis.MSystemThemaMapper;
import com.example.demo.model.common.GenericRecord;
import com.example.demo.model.mybatis.MPrefecture;
import com.example.demo.model.mybatis.MPrefectureExample;
import com.example.demo.model.mybatis.MSystemThema;
import com.example.demo.model.mybatis.MSystemThemaExample;

@Service
@Transactional
public class DropDownService {

    @Autowired
    MSystemThemaMapper mSystemThemaMapper;
    @Autowired
    MPrefectureMapper mPrefectureMapper;

    public List<GenericRecord> getSystemThemaList() {
        MSystemThemaExample example = new MSystemThemaExample();
        example.createCriteria().andDeletedEqualTo(false);
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

    public List<GenericRecord> getPrefectureList() {
        MPrefectureExample example = new MPrefectureExample();
        example.createCriteria().andDeletedEqualTo(false);
        example.setOrderByClause("order_no, system_thema_cd");
        List<MPrefecture> Prefecturelist = mPrefectureMapper.selectByExample(example);
        List<GenericRecord> list = new ArrayList<>();
        for (MPrefecture PrefectureRecord : Prefecturelist) {
            GenericRecord record = new GenericRecord();
            record.setCd(PrefectureRecord.getPrefectureCd());
            record.setNm(PrefectureRecord.getPrefectureNm());
            list.add(record);
        }
        return list;
    }
}
