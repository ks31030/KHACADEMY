package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//CompareExam -> User Student Actor rename
//implement Compare
public class Actor {

	public static void main(String[] args) {
		List<ActorEach> actors = new ArrayList<>();
		actors.add(new ActorEach("���¿�", 44));
		actors.add(new ActorEach("���¹�", 44));
		actors.add(new ActorEach("������", 46));
		
		Collections.sort(actors);
		for(ActorEach actor : actors) {
			System.out.println(actor);
		}
	}
}
