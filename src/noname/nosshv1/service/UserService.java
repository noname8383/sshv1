package noname.nosshv1.service;

import java.util.List;

import noname.nosshv1.pojo.User;

public interface UserService {
	public boolean saveDao(String name, String password, String role);
	public List<User> searchDao();
	public List<User> searchUser(String name, String password);
}
