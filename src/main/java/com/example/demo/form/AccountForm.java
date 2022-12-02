package com.example.demo.form;

import javax.validation.Valid;

import com.example.demo.model.Account;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountForm {

	@Valid
	private Account account;
}
