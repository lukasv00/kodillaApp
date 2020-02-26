package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AttachmentByType {

    @JsonProperty("trello")
    public Trello trello;

    public AttachmentByType() {
    }

    public AttachmentByType(Trello trello) {
        this.trello = trello;
    }

    public Trello getTrello() {
        return trello;
    }
}
