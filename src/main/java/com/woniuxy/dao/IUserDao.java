package com.woniuxy.dao;

import java.util.List;

import com.woniuxy.bean.User;

public interface IUserDao {
	void save(User user);
	void delete(Integer id);
	void update(User user);
	List<User> find();
	User find(Integer id);
	
	int getRowCount();
	List<User> find(int startLine, int size);
}
