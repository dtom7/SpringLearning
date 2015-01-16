package com.example.SpringLearning;

public class CustomBean {
	/* look-up method */
	protected PrototypeBean createPrototypeBean() {
		return null;
	}

	private CustomBeanFactory.NewBean newBean;

	public CustomBeanFactory.NewBean getNewBean() {
		return newBean;
	}

	public void setNewBean(CustomBeanFactory.NewBean newBean) {
		this.newBean = newBean;
	}

}
