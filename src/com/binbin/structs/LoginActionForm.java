package com.binbin.structs;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm {
	// �û���
	private String username;
	// ����
	private String password;

	// ��������
	public void setPassword(String password) {
		this.password = password;
	}

	// �õ�����
	public String getPassword() {
		return password;
	}

	// �����û���
	public void setUsername(String username) {
		this.username = username;
	}

	// �õ��û���
	public String getUsername() {
		return username;
	}
}