package noname.nosshv1.struts;

import java.util.List;

import noname.nosshv1.pojo.Account;
import noname.nosshv1.pojo.User;
import noname.nosshv1.service.AccountService;
import noname.nosshv1.service.UserService;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String userName;
	private String password;
	private UserService userService;
	private AccountService accountService;
	
	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception {
		if (login(userName, password)) {
			List<Account> accounts = this.accountService.searchAllAccount();
			if (accounts != null & accounts.size() > 0) {
				ActionContext.getContext().put("accounts", accounts);
			}
			return "success";
		} else {
			return "error";
		}
	}
	
	private boolean login(String username, String password) {
		List<User> users = this.userService.searchUser(username, password);
		if (users == null || users.size() == 0) {
			return false;
		} else {
			User user = users.get(0);
			ActionContext.getContext().put("role", user.getRole());
			return true;
		}
	}
	
	private boolean searchUser(String username, String password) {
		this.userService.saveDao(username, password, "R");
		List<User> users = this.userService.searchDao();
		ActionContext.getContext().put("users", users);
//		below code is the struts and hibernate without spring
//		Session session = factory.openSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			String hql = "FROM User WHERE name=:name and password=:password";
//	        Query query = session.createQuery(hql);
//	        // query.setLong(0, 2l);
//	        // query.setParameter(0, 2l);
//	        query.setParameter("name", username);
//	        query.setParameter("password", password);
//	        // List<Customer> list = query.list();
//	        User user = (User) query.uniqueResult();
//			 if (user != null) {
//				 return true;
//			 }
//			User use = new User();
//			String date = new Date().toString();
//			use.setId(date);
//			use.setName(username);
//			use.setPassword(password);
//
//			session.save(use);
//			tx.commit();
//			
//			List<User> users = session.createQuery("from User").list();
//			ActionContext.getContext().put("users", users);
//			
//		} catch (HibernateException e) {
//			if (tx != null)
//				tx.rollback();
//			e.printStackTrace();
//		} finally {
//			session.close();
//		}
		return true;
	}

}
