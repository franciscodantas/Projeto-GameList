package com.francisco.dslist.dto;

import com.francisco.dslist.entities.GameList;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto(){

    }

    public GameListDto(GameList list){
        this.id = list.getId();
        this.name = list.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
