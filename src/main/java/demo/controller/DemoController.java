package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class DemoController {

    @RequestMapping("/")
    public @ResponseBody String hi(){
        return "Hello Spring Boot";
    }

    @RequestMapping("/hi/{name}")
    public @ResponseBody String sayHiWithName(@PathVariable String name){
        return "Hello "+name;
    }

    @RequestMapping("/hi/thymeleaf/{name}")
    public String hiThymeLeaf(Map model, @PathVariable String name){
        model.put("name",name);
        return "hello";
    }

    @RequestMapping("/hi/jsp/{name}")
    public String hiJSP(Map model,@PathVariable String name){
        model.put("name",name);
        return "hello";
    }
}
