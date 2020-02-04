package noname.nosshv1.dao;

import java.util.List;

import noname.nosshv1.pojo.Account;

public interface AccountDao {
	public List<Account> searchAllAccounts();
	public void saveAccount(String account, String username, String password, String comment);
	public void updateDao(int id, String account, String username, String password, String comment);
	public Account searchAccount(int id);
	public void deleteAccount(int id);
}
