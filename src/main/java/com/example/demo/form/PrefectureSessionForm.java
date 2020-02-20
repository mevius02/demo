package com.example.demo.form;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import lombok.Data;

/** セッションフォーム */
@Data
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrefectureSessionForm implements Serializable {
	/** 検索条件フォーム */
	private PrefectureSearchForm searchForm;
	/** 明細フォーム */
	private PrefectureListForm listForm;
}
