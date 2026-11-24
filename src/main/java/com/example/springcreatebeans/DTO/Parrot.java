package com.example.springcreatebeans.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Parrot {
    private final Master master;

    private String name;

    @Override
    public String toString() {
        return "Parrot name: " + name+ " and his Master name: " + master.getName();
    }
}
