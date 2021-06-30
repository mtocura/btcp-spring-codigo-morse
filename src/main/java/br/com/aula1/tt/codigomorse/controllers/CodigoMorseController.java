package br.com.aula1.tt.codigomorse.controllers;

import br.com.aula1.tt.codigomorse.utils.CodigoMorse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula1/tt")
public class CodigoMorseController {

    @RequestMapping("/morse/{codigo}")
    public String codigoMorse(@PathVariable String codigo) {
        if(codigo.matches("[.-]{1,5}(?> [.-]{1,5})*(?>   [.-]{1,5}(?> [.-]{1,5})*)*")) {
            return codigo + " = " + CodigoMorse.codigoMorse(codigo);
        }
        return "Parâmetro inválido!";
    }
}
