package com.norauto.front.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

/**
 * Servlet filter that presents a HEAD request as a GET. The application doesn't
 * need to know the difference, as this filter handles all the details.
 */
public class UrlFilter implements Filter {
	
	
	static final Logger logger = Logger.getLogger(UrlFilter.class);
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// Do nothing
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain next) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		logger.info("call API : " + httpServletRequest.getMethod() + " : "+ httpServletRequest.getRequestURI());
		
		next.doFilter(request, response);
	}

	public void destroy() {
		// Do nothing
	}
	
}
