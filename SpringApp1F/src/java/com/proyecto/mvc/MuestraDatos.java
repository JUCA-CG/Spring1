/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jc_ca
 */@Controller
public class MuestraDatos {
    @RequestMapping(value = "muestraDatos.htm", method = RequestMethod.GET)
    public String muestraDatos(){
        System.out.println();
        return "muestradatos";
    }
}
