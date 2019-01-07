//UserDAO.java
package com.st.dao.jdbc;
import com.st.dao.UserDAOI;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDAO extends JdbcDaoSupport implements UserDAOI
{
	/*private JdbcTemplate jt;
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jt=jt;
	}*/
	public boolean findUser(String uname,String pass) {
		int count=getJdbcTemplate().queryForInt("select count(uname) from user_login_details where uname=? and pass=?",new Object[]{uname,pass});
		return(count==1);
	}
}