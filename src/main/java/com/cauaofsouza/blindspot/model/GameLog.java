package com.cauaofsouza.blindspot.model;

//gamelog sem data por enquanto
public record GameLog(String log){
    @Override
    public String toString() {
        return log + "\n";
    }
}
