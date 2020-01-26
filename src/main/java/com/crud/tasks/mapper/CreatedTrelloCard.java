package com.crud.tasks.mapper;

import com.crud.tasks.domain.TrelloBadges;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTrelloCard {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("shortUrl")
    private String shortUrl;

    public CreatedTrelloCard(String id, String name, String shortUrl) {
        this.id = id;
        this.name = name;
        this.shortUrl = shortUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortUrl() {
        return shortUrl;
    }
    // @JsonProperty("badges")
   // private TrelloBadges badges;

}
