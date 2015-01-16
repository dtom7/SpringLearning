package com.example.SpringLearning;

import org.springframework.beans.factory.FactoryBean;

public class CustomBeanFactory implements FactoryBean<CustomBeanFactory.NewBean> {
	
	private static NewBean newBean;

	@Override
	public NewBean getObject() throws Exception {
		if (newBean == null) {
			newBean = new NewBean();
		}
		return newBean;
	}

	@Override
	public Class<?> getObjectType() {
		return NewBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	static class NewBean {
		private NewBean() {}
		public String toString() {
			return "New bean singleton instance: " + super.toString();
		}
	}

}
