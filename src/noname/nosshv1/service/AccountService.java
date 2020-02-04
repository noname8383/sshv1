package noname.nosshv1.service;

import java.util.List;

import noname.nosshv1.pojo.Account;

public interface AccountService {
	public List<Account> searchAllAccount();
	public void saveDao(String account, String username, String password, String comment);
	public void updateDao(int id, String account, String username, String password, String comment);
	public Account searchAccount(int id);
	public void deleteDao(int id);
}
