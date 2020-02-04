package noname.nosshv1.struts;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import noname.nosshv1.pojo.Account;
import noname.nosshv1.service.AccountService;

public class AccountDeleteAction {
	private AccountService accountService;
	private String id;
	private String role;
	public AccountService getAccountService() {
		return accountService;
	}
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String execute() throws Exception {
		int intid = new Integer(id).intValue();
		this.accountService.deleteDao(intid);
		List<Account> accounts = this.accountService.searchAllAccount();
		if (accounts != null & accounts.size() > 0) {
			ActionContext.getContext().put("accounts", accounts);
			ActionContext.getContext().put("role", role);
		}
		return "success";
	}
}
