package com.cauaofsouza.blindspot.model;

import lombok.Getter;

@Getter
public class Player {
    private final String name;
    private int life;
    private int score;
    private Phase currentPhase;
    private Coordinate location;

    //para carregar estado
    public Player(int life, int score,  Phase currentPhase,  Coordinate location,  String name) {
        this.life = life;
        this.score = score;
        this.currentPhase = currentPhase;
        this.location = location;
        this.name = name;
    }

    //TODO: colocar em classe de mecânica de jogo; GameService
    public void walk(String direction){
        switch (direction.toLowerCase()){
            case "north" -> location.setY(location.getY() + 1);
            case "east" -> location.setX(location.getX() + 1);
            case "south" -> location.setY(location.getY() - 1);
            case "west" -> location.setX(location.getX() - 1);

            //TODO: exception de direção inválida
        }
        //TODO: verificar se muda de fase aqui
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
