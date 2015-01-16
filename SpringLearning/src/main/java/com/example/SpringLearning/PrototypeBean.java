package com.example.SpringLearning;

import org.springframework.beans.factory.BeanNameAware;

public class PrototypeBean implements BeanNameAware {
	
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String getMessageForReimplememt() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
    private String beanName;
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;	
	}

}
