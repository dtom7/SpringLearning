package com.example.SpringLearning;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class PrototypeReplacement implements MethodReplacer {
	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		return ((PrototypeBean)arg0).getMessageForReimplememt().toUpperCase();
	}
}
