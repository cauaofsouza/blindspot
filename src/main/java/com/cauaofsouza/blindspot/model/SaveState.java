package com.cauaofsouza.blindspot.model;

import lombok.Getter;

import java.util.Collection;

@Getter
public class SaveState {
    private Collection<GameLog> logs;
    private Player player;

    public SaveState(Collection<GameLog> logs, Player player){
        this.logs = logs;
        this.player = player;
    }

    public void addLog(GameLog log){
        this.logs.add(log);
    }
}
