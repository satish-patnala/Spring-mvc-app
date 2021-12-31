package com.app.springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {ApplicationConfiguration.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr[]= {"/mywebsite.com/*","/"};
		return arr;
	}
	
}
