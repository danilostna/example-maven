package br.com.santana.examplemaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String HelloMessage(){
        return "Olá Danilo";
    }
}
