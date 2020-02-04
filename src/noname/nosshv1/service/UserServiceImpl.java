package noname.nosshv1.service;

import java.util.List;

import noname.nosshv1.dao.UserDao;
import noname.nosshv1.pojo.User;

public class UserServiceImpl implements UserService{
	private UserDao userDao = null;
	
	public void setUserDao (UserDao dao) {
		this.userDao = dao;
	}
	public UserDao getUserDao () {
		return userDao;
	}
	public boolean saveDao (String name, String password, String role) {
		return userDao.saveUser(name, password, role);
	}
	public List<User> searchDao() {
		return userDao.searchAllUsers();
	}
	public List<User> searchUser(String name, String password) {
		return userDao.searchUser(name, password);
	}
}
