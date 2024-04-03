package com.elsevier.kata.controller;


import com.elsevier.kata.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {

    @Autowired
    private ToDoListService toDoListService;

    @PostMapping(path = "/add/{item}")
    public ResponseEntity<String> addItem(@PathVariable String item) {
        toDoListService.addItemToList(item);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
