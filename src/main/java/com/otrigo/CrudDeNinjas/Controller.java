package com.otrigo.CrudDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/rotaget")
     public String welcome(){
        return "Essa é a minha primeira mensagem";
    }

    @PostMapping("/rotapost")
    public void rotaPost(){

    }
}
