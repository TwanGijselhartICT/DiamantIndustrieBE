package com.backend.diamantindustrie.web;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.backend.diamantindustrie.SelectQuery;
import com.backend.diamantindustrie.domain.ToDoItem;
import com.backend.diamantindustrie.repository.UserRepository;
import com.backend.diamantindustrie.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Convert;

@RestController
public class DiamantController {

    @Autowired
    private ToDoService todoService;
    @Autowired
    private UserService userService;

    @Autowired
    private PointOfInterestService pointOfInterestService;

    @GetMapping("/api/todoItems")
    public ResponseEntity<List<ToDoItem>> fetchAllToDoItems() {
        List<ToDoItem> todoItems = todoService.fetchAllToDoItems();

        return ResponseEntity.ok(todoItems);
    }

    @GetMapping("/api/poi")
    public ResponseEntity<?> fetchAllPOINames(){
        return ResponseEntity.ok(pointOfInterestService.FetchAllPointOfInterest());
    }


    @RequestMapping(method = RequestMethod.POST, value = "/api/user")
    public ResponseEntity<?> controllerMethod(@RequestParam Map<String, String> customQuery){
        System.out.println("Username: " + customQuery.get("username"));
        System.out.println("Age: " + customQuery.get("age"));



        return  ResponseEntity.ok(userService.InsertUserIntoDB(customQuery.get("username"), Integer.parseInt(customQuery.get("age"))));
    }



}
