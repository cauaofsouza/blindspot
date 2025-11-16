package com.cauaofsouza.blindspot.model;

import lombok.Getter;

@Getter
public class Clock {
    private int time;
    private final int cycle;

    public Clock(int hours, int cycle){
        this.time = hours;
        this.cycle = cycle;
    }

    public void advance(int time) {
        int diff = this.time + time;
        this.time = diff < cycle ? diff : diff - cycle;
    }
}
