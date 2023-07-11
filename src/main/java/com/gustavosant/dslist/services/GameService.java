package com.gustavosant.dslist.services;

import com.gustavosant.dslist.dto.GameMinDTO;
import com.gustavosant.dslist.entities.Game;
import com.gustavosant.dslist.repositories.GameRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepositoty gameRepositoty;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepositoty.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }
}
