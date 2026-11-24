package com.example.springcreatebeans.DTO;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@Component
public class AnimalMaster {
    @Setter
    private String name;

    @Override
    public String toString() {
        return "Master name: " + name;
    }
}
