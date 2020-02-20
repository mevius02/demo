package com.example.demo.contoller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.mybatis.MPrefecture;
import com.example.demo.form.PrefectureListForm;
import com.example.demo.form.PrefectureSearchForm;
import com.example.demo.form.PrefectureSessionForm;
import com.example.demo.service.PrefectureService;

@Controller
@RequestMapping(value = "/prefecture")
public class PrefectureController{
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private PrefectureSessionForm sessionForm;
	@Autowired
	private PrefectureService prefectureService;

	// ログ
	private Log log = LogFactory.getLog(PrefectureController.class);

	// View返却パス
	private String HTML_PATH_INDEX  = "views/prefecture/prefecture";
	private String HTML_PATH_SEARCH = "views/prefecture/parts/prefectureSearchConditions";

	@ModelAttribute("searchForm")
	public PrefectureSearchForm getSearchForm() {
		return new PrefectureSearchForm();
	}
	@ModelAttribute("listForm")
	public PrefectureListForm getListForm() {
		return new PrefectureListForm();
	}

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "")
	public String init(Model model){
		PrefectureSearchForm searchForm = new PrefectureSearchForm();
		sessionForm.setSearchForm(searchForm);
		PrefectureListForm listForm = new PrefectureListForm();
		sessionForm.setListForm(listForm);
		return HTML_PATH_INDEX;
	}

	/**
	 * @param submitForm
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@ModelAttribute("searchForm") @Validated PrefectureSearchForm submitForm, BindingResult result, Model model){
		// エラーチェック
		if(result.hasErrors()){
			sessionForm.setSearchForm(submitForm);
			return HTML_PATH_INDEX;
		}
		log.info("[検索]マスタ都道府県");
		List<MPrefecture> dataList = prefectureService.selectList(submitForm);
		sessionForm.setSearchForm(submitForm);
		PrefectureListForm listForm = new PrefectureListForm();
		listForm.setDataList(dataList);
		sessionForm.getListForm().setDataList(dataList);
		model.addAttribute("listForm", listForm);
		return HTML_PATH_INDEX;
	}

	/**
	 * @param submitForm
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/reloadSearchArea", method = RequestMethod.GET)
	public String reloadSearchArea(@ModelAttribute("searchForm") @Validated PrefectureSearchForm submitForm, BindingResult result, Model model){
		// エラーチェック
		if(result.hasErrors()){
			sessionForm.setSearchForm(submitForm);
			return HTML_PATH_SEARCH + "::searchConditions01()";
		}
		sessionForm.setSearchForm(submitForm);
		return HTML_PATH_SEARCH + "::searchConditions01()";
	}
}
