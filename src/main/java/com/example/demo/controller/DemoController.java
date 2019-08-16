package com.example.demo.controller;

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
}
