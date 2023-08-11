package com.in28minutes.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		String username=(String)model.get("name");
		Todo todo=new Todo(0,username,"",LocalDate.now().plusYears(1),false);
		model.put("todo",todo);
		
		return "addTodo";
	}
	
	
//	@RequestMapping(value="add-todo",method=RequestMethod.POST)
//	public String addNewTodo(@RequestParam String description ,ModelMap model)
//	{
//		String username=(String) model.get("name");
//		todoservice.addTodo(username, description, LocalDate.now().plusYears(1), false);
//		
//		
//		return "redirect:list-todos";
//	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addNewTodo(ModelMap model,Todo todo)
	{
		String username=(String) model.get("name");
		todoservice.addTodo(username,todo.getDescription(), LocalDate.now().plusYears(1), false);
		
		
		return "redirect:list-todos";
	}
	
	
	
	
}
