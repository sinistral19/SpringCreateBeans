package com.example.springcreatebeans.DTO;

import lombok.Getter;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Cat {

    private final AnimalMaster master;

    @Setter
    private String name;
@Autowired
    public Cat(AnimalMaster master) {
        this.master = master;
    }
}
