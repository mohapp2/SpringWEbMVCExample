//LoginController.java
package com.st.web;
import com.st.dao.UserDAOI;
import com.st.dao.jdbc.UserDAO;
import javax.servlet.http.*;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.ModelAndView;

public class LoginController implements Controller
{
	private UserDAOI udao;
	public void setUserDAO(UserDAOI  u) {
	udao=u;
	}
	public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res) throws Exception {
		System.out.println("In LoginController");
	String uname=req.getParameter("uname");
	String pass=req.getParameter("pass");
	boolean flag=udao.findUser(uname,pass);
	if(flag) {
		return new ModelAndView("/UserHome.jsp");
	}
	return new ModelAndView("/Login.html");
	}//handleRequest
}