package com.backend.diamantindustrie.web;

import java.util.List;

import com.backend.diamantindustrie.domain.ToDoItem;
import com.backend.diamantindustrie.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiamantController {

    @Autowired
    private ToDoService todoService;

    @GetMapping("/api/todoItems")
    public ResponseEntity<?> fetchAllToDoItems() {
        List<ToDoItem> todoItems = todoService.fetchAllToDoItems();

        return ResponseEntity.ok(todoItems);
    }

}
