package com.kh.personMVC;

public class PersonController {
	private PersonModel model;
	private PersonView view;
	
	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	public void info() {
		String nameInput = view.getNameInput();
		model.setName(nameInput);

		String hobbyInput = view.getHobbyInput();
		model.setHobby(hobbyInput);
		
		System.out.println(nameInput + "의 취미는 " + hobbyInput + "입니다." );
	}
}
