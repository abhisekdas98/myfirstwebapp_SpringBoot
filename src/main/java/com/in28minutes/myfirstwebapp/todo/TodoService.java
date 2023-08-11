package com.in28minutes.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos;
	private static int count=0;
	static
	{
		todos=new LinkedList<Todo>();
		todos.add(new Todo(++count,"Abhisek","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++count,"Abhisek","Learn Java",LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++count,"Abhisek","Learn ML",LocalDate.now().plusYears(3),false));
		
	}
	
	public List<Todo> findByUsername(String Username)
	{
		return todos;
	}
	
	public void addTodo(String username,String description,LocalDate localdate,boolean done)
	{

		Todo todo=new Todo(++count,username,description,localdate,done);
		
		todos.add(todo);
		
	}

}
