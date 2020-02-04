package noname.nosshv1.struts;

import com.opensymphony.xwork2.ActionContext;

import noname.nosshv1.pojo.Account;
import noname.nosshv1.service.AccountService;


public class UpdateAction {
	private AccountService accountService;
	private String account;
	private String username;
	private String password;
	private String comment;
	private String role;
	private String id;
	
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
		Account act = this.accountService.searchAccount(intid);
		if (act != null) {
			ActionContext.getContext().put("id", id);
			ActionContext.getContext().put("account", act.getAccount());
			ActionContext.getContext().put("username", act.getUsername());
			ActionContext.getContext().put("password", act.getPassword());
			ActionContext.getContext().put("comment", act.getComment());
		}
		ActionContext.getContext().put("role", role);
		return "success";
	}

}
