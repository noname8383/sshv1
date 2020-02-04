package noname.nosshv1.dao;

import java.util.List;

import noname.nosshv1.pojo.User;

public interface UserDao {
	public List<User> searchAllUsers();
	public boolean saveUser(String name, String password, String role);
	public List<User> searchUser(String name, String password);
}