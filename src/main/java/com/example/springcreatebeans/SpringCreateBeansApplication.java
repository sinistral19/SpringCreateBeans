package com.example.springcreatebeans;

import com.example.springcreatebeans.Configuration.ProjectConfig;
import com.example.springcreatebeans.DTO.Dog;
import com.example.springcreatebeans.DTO.Master;
import com.example.springcreatebeans.DTO.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCreateBeansApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCreateBeansApplication.class, args);
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot=context.getBean("parrot",Parrot.class);
        Master master=context.getBean(Master.class);
        System.out.println(master);
        System.out.println(parrot);

        Parrot parrot2=context.getBean("parrot2",Parrot.class);
        System.out.println(parrot2);



        Dog dog=context.getBean(Dog.class);
        Master dogmaster=context.getBean(Master.class);
        System.out.println(dogmaster);
        System.out.println(dog);
    }

}
