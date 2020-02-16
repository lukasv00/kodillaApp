package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBadges {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attchmentsByType")
    private AttachmentByType attachments;

    public TrelloBadges() {
    }

    public TrelloBadges(int votes, AttachmentByType attachments) {
        this.votes = votes;
    }

    public int getVotes() {
        return votes;
    }

    public AttachmentByType getAttachments() {
        return attachments;
    }
}
