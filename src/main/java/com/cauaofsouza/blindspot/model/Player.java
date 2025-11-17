package com.cauaofsouza.blindspot.model;

import com.cauaofsouza.blindspot.model.exception.DeathException;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
public class Player {
    private final String name;
    private String id;
    private int life;

    @Setter
    private int score;

    @Setter
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
    public Player(int life, int score,  Coordinate location,  String name) {
        this.life = life;
        this.score = score;
        this.location = location;
        this.name = name;
    }

    /**
     * Metodo para reduzir vida, verificando morte*/
    public void lowLife(Damage damage) throws DeathException {
        int check = this.life - damage.value();
        if (check > 0){
            this.life -= damage.value();
        } else {
            throw new DeathException(damage.damage());
        }
    }


    public void sumScore(int score){
        this.score += score;
    }

}
