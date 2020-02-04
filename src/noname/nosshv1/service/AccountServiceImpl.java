package noname.nosshv1.service;

import java.util.List;

import noname.nosshv1.dao.AccountDao;
import noname.nosshv1.pojo.Account;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao = null;
	
	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public List<Account> searchAllAccount() {
		return accountDao.searchAllAccounts();
	}
	
	public void saveDao(String account, String username, String password, String comment) {
		accountDao.saveAccount(account, username, password, comment);
	}
	
	public void updateDao(int id, String account, String username, String password, String comment) {
		accountDao.updateDao(id, account, username, password, comment);
	}
	
	public Account searchAccount(int id) {
		return accountDao.searchAccount(id);
	}
	
	public void deleteDao(int id) {
		accountDao.deleteAccount(id);
	}
}
