package com.francisco.dslist.services;

import com.francisco.dslist.dto.GameDto;
import com.francisco.dslist.dto.GameMinDto;
import com.francisco.dslist.entities.Game;
import com.francisco.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        var result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDto::new).toList();
    }
}
