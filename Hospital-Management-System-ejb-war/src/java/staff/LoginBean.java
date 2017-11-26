/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import BookStore.ejb.beans.UserManagerLocal;
import BookStore.ejb.persistence.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ssome
 */

@Named(value = "loginBean")
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    @EJB
    private UserManagerLocal userManager;

	private static final long serialVersionUID = 1094801825228386363L;
	
	private String pwd;
	private String msg;
	private String user;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	//validate login
	public String validateUsernamePassword() {
            
            
//		boolean valid = LoginDAO.validate(user, pwd);
//		if (valid) {
//			HttpSession session = SessionUtils.getSession();
//			session.setAttribute("username", user);
//			return "admin";
//		} else {
//			FacesContext.getCurrentInstance().addMessage(
//					null,
//					new FacesMessage(FacesMessage.SEVERITY_WARN,
//							"Incorrect Username and Passowrd",
//							"Please enter correct username and Password"));
//    items=new ArrayList<>();
        User resultList = userManager.find("user");
        if (resultList != null) {
            return "index";
        }
        else{
               this.setMsg("Validated");
                return "index"; 
                }

//		}
	}

	//logout event, invalidate session
	public String logout() {
//		HttpSession session = SessionUtils.getSession();
//		session.invalidate();
		return "index";
	}
}
