package edu.al.uber.model;

public class Account {
    Integer id;
    String document;
    String name;
    String email;
    String password;

    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }
}
