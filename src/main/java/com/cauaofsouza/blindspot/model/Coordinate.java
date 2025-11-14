package com.cauaofsouza.blindspot.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate{
    private int x, y;
    public Coordinate(int x, int y){
        this.x = (int) x;
        this.y = (int) y;
    }
}
