package com.project.confessions.model;

public class Note {
    private String content;

    public Note(){}
    public Note(String content){
        this.content= content;
    }

    public String getContent() { 
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
