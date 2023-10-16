package com.kh.personMVC;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonModel model = new PersonModel();
		PersonView view = new PersonView();
		PersonController controller = new PersonController(model, view);
		
		controller.info();
		
	}

}
