package com.gustavosant.dslist.controllers;

import com.gustavosant.dslist.dto.GameDTO;
import com.gustavosant.dslist.dto.GameMinDTO;
import com.gustavosant.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO FindById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
}

