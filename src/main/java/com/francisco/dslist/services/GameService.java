package com.francisco.dslist.services;

import com.francisco.dslist.dto.GameMinDto;
import com.francisco.dslist.entities.Game;
import com.francisco.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        var result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(GameMinDto::new).toList();
        return dto;
    }
}
