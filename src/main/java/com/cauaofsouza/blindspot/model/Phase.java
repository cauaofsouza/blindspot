package com.cauaofsouza.blindspot.model;

import lombok.Getter;

import java.util.Collection;

@Getter
public class Phase {
    private String name;
    private String localDescription;
    private Collection<String> mobs;
}
