package com.in28minutes.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos;
	static
	{
		todos=new LinkedList<Todo>();
		todos.add(new Todo(1,"Abhisek","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"Abhisek","Learn Java",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"Abhisek","Learn ML",LocalDate.now().plusYears(3),false));
		
	}
	
	public List<Todo> findByUsername(String Username)
	{
		return todos;
	}

}
