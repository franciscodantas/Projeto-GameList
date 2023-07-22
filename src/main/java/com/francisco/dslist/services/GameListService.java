package com.francisco.dslist.services;

import com.francisco.dslist.dto.GameDto;
import com.francisco.dslist.dto.GameListDto;
import com.francisco.dslist.dto.GameMinDto;
import com.francisco.dslist.entities.Game;
import com.francisco.dslist.entities.GameList;
import com.francisco.dslist.repositories.GameListRepository;
import com.francisco.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(GameListDto::new).toList();
    }
}
