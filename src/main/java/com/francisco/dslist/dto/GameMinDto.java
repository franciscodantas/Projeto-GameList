package com.francisco.dslist.dto;

import com.francisco.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDto {

    private Long id;
    private String title;
    private Integer year;

    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){}

    public GameMinDto(Game entity){
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.year = entity.getYear();
        this.title = entity.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
