package com.example.ValidateService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Request {
    @Id
    private Long id;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
