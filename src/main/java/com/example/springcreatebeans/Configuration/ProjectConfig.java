package com.example.springcreatebeans.Configuration;

import com.example.springcreatebeans.DTO.Master;
import com.example.springcreatebeans.DTO.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.springcreatebeans")
public class ProjectConfig {
    @Bean
    public Master master(){
        Master master = new Master("Alan");
        return master;
    }

    @Bean
    public Parrot parrot (){
        Parrot parrot = new Parrot(master(),"Kesha");
        return parrot;
    }
    @Bean
    public Parrot parrot2 (Master master){
        Parrot parrot = new Parrot(master,"KeshaSecond");
        return parrot;
    }
}
