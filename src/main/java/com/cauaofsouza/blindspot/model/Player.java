package com.cauaofsouza.blindspot.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Player {
    private String id;
    private final String name;
    private int life;
    private int score;
    private Coordinate location;

    //cria player do 0
    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.location = new Coordinate(0, 0);
        this.life = 100;
        this.score = 0;
    }

    //carregar estado
    public Player(int life, int score,  Phase currentPhase,  Coordinate location,  String name) {
        this.life = life;
        this.score = score;
        this.location = location;
        this.name = name;
    }

    /**
     * Metodo para reduzir vida, verificando morte*/
    public void lowLife(int value){
        int check = this.life - value;
        if (check > 0){
            this.life -= value;
        } else {
            //TODO: exception de morte
        }
    }

    /**
     * Metodo setter para mudar de fase*/
    public void setPhase(Phase phase){
        this.currentPhase = phase;
    }

    public void sumScore(int score){
        this.score += score;
    }



}
