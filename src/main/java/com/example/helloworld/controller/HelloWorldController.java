package com.example.helloworld.controller;

import com.example.helloworld.bean.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return  "hello world";
    }

    @GetMapping("helloworldbean")
    public HelloWorld helloWorldBean(){
        return new HelloWorld("com.example.helloworld.bean of hello world");
    }

    @GetMapping("helloworldbean/pathvariable/{name}")
    public HelloWorld helloWorldBeanParaqm(@PathVariable String name){
        return new HelloWorld("com.example.helloworld.bean of hello world " + name );
    }
}
