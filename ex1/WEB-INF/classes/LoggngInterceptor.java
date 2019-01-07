//LoggingInterceptor.java
package com.st.web;
import javax.servlet.http.*;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoggngInterceptor implements HandlerInterceptor
{
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object h) throws Exception {
	System.out.println("In preHandle: Logging");
	return true;
	}
	public void postHandle(HttpServletRequest req,HttpServletResponse res,Object h,ModelAndView mav) throws Exception {
	System.out.println("In postHandle: Logging");
	}

	public void afterCompletion(HttpServletRequest req,HttpServletResponse res,Object h,Exception e) throws Exception {
	System.out.println("In afterCompletion: Logging");
	}
}