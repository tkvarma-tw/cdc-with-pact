package de.kreuzwerker.cdc.messagingapp;

import lombok.Data;

@Data
public class Friend {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String id;
    private String name;

}
