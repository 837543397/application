package com.wp.application.control;

import com.wp.application.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    @ResponseBody
    public Person hello(){

        Person person = new Person(1, "gbh");

        return person;
    }

}
