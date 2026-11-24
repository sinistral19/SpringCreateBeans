package com.example.springcreatebeans.DTO;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@RequiredArgsConstructor
@Component
public class Dog {
    @Autowired
    private final AnimalMaster master;
    @Setter
    private String name;
}
