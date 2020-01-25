package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trello {

    @JsonProperty("board")
    public int board;

    @JsonProperty("card")
    public int card;

    public Trello() {
    }

    public int getBoard() {
        return board;
    }

    public int getCard() {
        return card;
    }
}
