package com.francisco.dslist.controllers;

import com.francisco.dslist.dto.GameDto;
import com.francisco.dslist.dto.GameListDto;
import com.francisco.dslist.dto.GameMinDto;
import com.francisco.dslist.entities.GameList;
import com.francisco.dslist.services.GameListService;
import com.francisco.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private  GameService gameService;

    @GetMapping("/lists")
    public ResponseEntity<List<GameListDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(gameListService.findAll());
    }

    @GetMapping(value = "/lists/{listId}/games")
    public ResponseEntity<List<GameMinDto>> findById(@PathVariable Long listId){
        return ResponseEntity.status(HttpStatus.OK).body(gameService.findByList(listId));
    }
}
