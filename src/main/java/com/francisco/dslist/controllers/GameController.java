package com.francisco.dslist.controllers;

import com.francisco.dslist.dto.GameDto;
import com.francisco.dslist.dto.GameMinDto;
import com.francisco.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public ResponseEntity<List<GameMinDto>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(gameService.findAll());
    }

    @GetMapping("/games/{id}")
    public ResponseEntity<GameDto> findByid(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(gameService.findById(id));
    }
}
