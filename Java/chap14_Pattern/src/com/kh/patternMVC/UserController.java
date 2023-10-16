package com.kh.patternMVC;

public class UserController {
	public UserModel getModel() {
		return model;
	}

	public void setModel(UserModel model) {
		this.model = model;
	}

	public UserView getView() {
		return view;
	}

	public void setView(UserView view) {
		this.view = view;
	}

	private UserModel model;
	private UserView view;
	
	public UserController(UserModel model, UserView view) {
		this.model = model;
		this.view = view;
	}


}
