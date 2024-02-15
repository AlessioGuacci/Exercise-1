package com.Develope.exercise1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



//Scrivi una applicazione web Spring Boot che alla endpoint
//		GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con
//		"Ciao Giuseppe, com'è il tempo in Lombardia?"
@RequestMapping("/v1")
@RestController
public class Controller {
    @GetMapping("/ciao")
    public String ciaoGiuseppe(@RequestParam String nome,@RequestParam String regione){
        return "ciao " + nome + " com'é il tempo a " + regione;
    }
}
