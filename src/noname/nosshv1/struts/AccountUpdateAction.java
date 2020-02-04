package noname.nosshv1.struts;

import java.util.List;

import noname.nosshv1.pojo.Account;
import noname.nosshv1.service.AccountService;

import com.opensymphony.xwork2.ActionContext;

public class AccountUpdateAction {
	private AccountService accountService;
	private String id;
	private String account;
	private String username;
	private String password;
	private String comment;
	private String role;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String execute() throws Exception {
		int intid = new Integer(id).intValue();
		this.accountService.updateDao(intid, account, username, password, comment);
		List<Account> accounts = this.accountService.searchAllAccount();
		if (accounts != null & accounts.size() > 0) {
			ActionContext.getContext().put("accounts", accounts);
			ActionContext.getContext().put("role", role);
		}
		return "success";
	}
}
