package com.backend.diamantindustrie.domain;

public class ToDoItem {

    private Integer id;
    private String task;
    private Boolean isDone;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }

}
