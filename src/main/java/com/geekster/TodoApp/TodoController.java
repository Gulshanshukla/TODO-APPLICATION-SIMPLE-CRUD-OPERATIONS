package com.geekster.TodoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TodoController {
    @Autowired
   List<Todo> todoList;
   //createtodo-post method api
    //Add a toto
    @PostMapping("todo")
    public String addTodo(@RequestBody Todo myTodo)
    {
        todoList.add(myTodo);
        return "Todo Added";
    }
    //getApi get all todos
    @GetMapping("todos")
    public List<Todo>  getAlltodos()
    {
        return todoList;
    }
    //update api
    @PutMapping("todo/id/{id}/statusupdate")
    public String setTodoStatusbyId(@PathVariable Integer id,@RequestParam boolean flag)
    {
        for(Todo todo:todoList)
        {
            if(todo.getTodoId().equals(id))
                todo.setTodoStatus(flag);
            return "todo:" + id + "update to"+ flag;
        }
        return "invalid id";
    }
    @DeleteMapping("todo/delete/id/{id}")
    public String deleteTodoBtId(@PathVariable Integer id)
    {
        Todo todoToRemove=null;
        for(Todo todo:todoList)
        {
            if(todo.getTodoId().equals(id))
            {
                todoToRemove=todo;
                break;

            }
        }
        if(todoToRemove!=null)
        {
            todoList.remove(todoToRemove);
            return "Todo with TodoId" +id+"deleted successfully";
        }
        else {
            return "Todo with TodoId" +id+ "not found";
        }

    }





}
