package com.juan.app.mcsv1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class Mcsv1Controller
{

    @GetMapping
    public String  entandar()
    {
        return "Juan carrasquer 2";
    }
}

