package com.in28minutes.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	

	public TodoController(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}

	private TodoService todoservice;
	
	@RequestMapping(value="list-todos",method=RequestMethod.GET)
	public String listAllTodos(ModelMap model)
	{
		List<Todo> todos=todoservice.findByUsername("Abhisek");
		model.addAttribute("username","Abhisek");
		model.addAttribute("todos",todos);
		
		return "listTodos";
	}
	
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String showNewTodoPage(ModelMap model)
	{
		
		return "addTodo";
	}
	
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addNewTodo(ModelMap model)
	{
		
		return "redirect:list-todos";
	}
	
	
	
	
	
}
