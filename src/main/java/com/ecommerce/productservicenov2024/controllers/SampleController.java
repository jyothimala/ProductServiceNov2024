package com.ecommerce.productservicenov2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SampleController {
    @GetMapping("/hello/{name}/{count}")
    public String sayHello(@PathVariable String name, @PathVariable int count){
        StringBuilder output = new StringBuilder();
        for(int i=0; i<count; i++){
            output.append("Hello ").append(name).append(" ");
        }


        return output.toString();
    }

    public String bye(){
        return "Bye Everyone";
    }

}
