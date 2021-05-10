package com.backend.diamantindustrie.repository;

import java.util.ArrayList;
import java.util.List;

import com.backend.diamantindustrie.domain.ToDoItem;

import org.springframework.stereotype.Repository;

@Repository
public class ToDoRepository {
    private Integer idCounter = 0;
    private List<ToDoItem> todoItems = new ArrayList<>();

    public List<ToDoItem> fetchAllToDoItems() {
        if (todoItems.size() == 0) {
            ToDoItem item1 = new ToDoItem();
            item1.setId(idCounter++);
            item1.setIsDone(false);
            item1.setTask("Task #1");

            todoItems.add(item1);

        }
        return todoItems;

    }
}
