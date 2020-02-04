package noname.nosshv1.struts;

import com.opensymphony.xwork2.ActionContext;


public class AddAction {
	private String role;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String execute() throws Exception {
		ActionContext.getContext().put("role", role);
		return "success";
	}

}
