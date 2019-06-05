package com.woniuxy.web.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.woniuxy.bean.Page;
import com.woniuxy.bean.User;
import com.woniuxy.service.IUserService;
import com.woniuxy.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	private int p;

	private User user = new User();
	
	private IUserService service = new UserServiceImpl();
	
	public String save() {
		service.save(user);
		return "find";
	}
	
	public String update() {
		service.update(user);
		return "find";
	}
	
	public String find() {
		Page page = service.findPageData(p, 5);
		ServletActionContext.getRequest().setAttribute("page", page);
		return "findUI";
	}
	
	public String delete() {
		service.delete(user.getId());
		return "find";
	}
	
	public String updateUI() {
		ServletActionContext.getRequest().setAttribute("user", service.find(user.getId()));
		return "updateUI";
	}
	
	@Override
	public User getModel() {
		return user;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	
	
}
