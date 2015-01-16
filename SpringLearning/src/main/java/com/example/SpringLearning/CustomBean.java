package com.example.SpringLearning;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanNameAware;

public class CustomBean implements BeanNameAware {
	/* look-up method */
	protected PrototypeBean createPrototypeBean() {
		return null;
	}
	
    private String beanName;
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;	
	}
}
