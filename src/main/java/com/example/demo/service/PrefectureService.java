package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.bean.mybatis.MPrefecture;
import com.example.demo.bean.mybatis.MPrefectureExample;
import com.example.demo.form.PrefectureSearchForm;
import com.example.demo.mapper.mybatis.MPrefectureMapper;
import com.example.demo.service.common.CommonService;

@Service
public class PrefectureService{
	@Autowired
	private CommonService commonService;
	@Autowired
	private MPrefectureMapper mPrefectureMapper;

	public List<MPrefecture> selectList(PrefectureSearchForm searchForm){
		MPrefectureExample example = new MPrefectureExample();
		MPrefectureExample.Criteria c = example.createCriteria();
		if(!StringUtils.isEmpty(searchForm.getName())){
			c.andNameLike(commonService.createSqlParamLike(searchForm.getName()));
		}
		if(!StringUtils.isEmpty(searchForm.getNameHira())){
			c.andNameHiraLike(commonService.createSqlParamLike(searchForm.getNameHira()));
		}
		if(!StringUtils.isEmpty(searchForm.getNameKana())){
			c.andNameKanaLike(commonService.createSqlParamLike(searchForm.getNameKana()));
		}
		if(!StringUtils.isEmpty(searchForm.getNameRoma())){
			c.andNameRomaLike(commonService.createSqlParamLike(searchForm.getNameRoma()));
		}
		return mPrefectureMapper.selectByExample(example);
	}
}
