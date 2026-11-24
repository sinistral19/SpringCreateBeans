package com.example.springcreatebeans.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
@NoArgsConstructor
public class Fox {

    private AnimalMaster master;

    @Setter
    private String name;

    @Autowired
    public void setMaster(AnimalMaster master) {
        this.master = master;
    }
}