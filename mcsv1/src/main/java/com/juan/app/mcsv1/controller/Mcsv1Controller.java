package com.juan.app.mcsv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mcsv1Controller
{
    @GetMapping
    public String entandar()
    {
        return "Hola mundo";
    }
}

