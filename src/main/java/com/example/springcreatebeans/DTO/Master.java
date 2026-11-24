package com.example.springcreatebeans.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Master {
private String name;

    @Override
    public String toString() {
        return "Master name: " + name;
    }
}
