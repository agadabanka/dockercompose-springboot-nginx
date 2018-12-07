package com.cnc.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    PlayerWrapper playerWrapper;

    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @RequestMapping("/create/{playerId}")
    public PlayerProtos.Player create(@PathVariable String playerId)
    {
        return playerWrapper.createPlayer();
    }
}
