package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    private String status;

    public String getStatus() {
        return status;
    }

    ProjectStatus(String status){
        this.status = status;
    }

    ProjectStatus(){
    }
}
