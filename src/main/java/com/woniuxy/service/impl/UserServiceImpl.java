package com.woniuxy.service.impl;

import java.util.List;

import com.woniuxy.bean.Page;
import com.woniuxy.bean.User;
import com.woniuxy.dao.IUserDao;
import com.woniuxy.dao.impl.UserDaoImpl;
import com.woniuxy.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao dao = new UserDaoImpl();
	
	@Override
	public void save(User user) {
		dao.save(user);
	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public void update(User user) {
		dao.update(user);
	}

	@Override
	public List<User> find() {
		return dao.find();
	}

	@Override
	public User find(Integer id) {
		return dao.find(id);
	}

	@Override
	public Page findPageData(int p, int size) {
		int rowCount = dao.getRowCount();
		// p = 5;  rowCount = 88;  size = 7;
		Page page = new Page(p,rowCount,size);
		// �����ߵ����page.getStartLine()��28�� page.getSize()��7
		
		// ����page����һ����10�����ԣ�����Ψ��listû��ֵ��
		List<User> list = dao.find(page.getStartLine(), page.getSize());
		page.setList(list);
		
		return page;
	}

}
