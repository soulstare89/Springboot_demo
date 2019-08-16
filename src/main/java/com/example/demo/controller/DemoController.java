package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping("/selectUsers")
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i+"abc");
        }
        return list;
    }

    @RequestMapping("/selectUsers2")
    public List<String> getList2(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i+"abc");
        }
        return list;
    }

}
