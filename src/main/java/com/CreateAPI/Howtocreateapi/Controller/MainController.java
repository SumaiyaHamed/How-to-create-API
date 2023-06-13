package com.CreateAPI.Howtocreateapi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class MainController {


//How to create API
    @GetMapping(path = "/api")
    public String getAPI(){
        return "Hello world";
    }

    //How to create Json Object
    @GetMapping(path = "/")
    public HashMap<String,String> getAPI1(){
        HashMap<String,String>response=new HashMap<>();
        response.put("Subject","Arabic");
        response.put("grade","A");
        return response;
    }
}
