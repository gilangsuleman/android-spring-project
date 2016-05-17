/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.poligon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fikran
 */
@RestController
public class HalloController {
    @RequestMapping("/cari/buku/aja")
    public String hallo(){
       return "hello fikran sai" ;
    }
}
