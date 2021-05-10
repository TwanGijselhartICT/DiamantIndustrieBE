package com.backend.diamantindustrie.service;

import java.util.List;

import com.backend.diamantindustrie.domain.ToDoItem;
import com.backend.diamantindustrie.repository.ToDoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository todoRepo;

    public List<ToDoItem> fetchAllToDoItems() {
        return todoRepo.fetchAllToDoItems();

    }

}
