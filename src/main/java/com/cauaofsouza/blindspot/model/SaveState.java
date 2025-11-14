package com.cauaofsouza.blindspot.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
public class SaveState {
    private Collection<String> log;
    private Player player;
}
