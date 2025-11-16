package com.cauaofsouza.blindspot.controller;

import com.cauaofsouza.blindspot.model.GameLog;
import com.cauaofsouza.blindspot.model.Player;
import com.cauaofsouza.blindspot.model.SaveState;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/player")
@AllArgsConstructor
public class PlayerController {

    //esse controller é para coisas relacionadas a instancia do jogo e do jogador
    @GetMapping("/{id}")
    public SaveState getSaveState(@PathVariable String id) {
        //TODO: Criar repositories para pegar o save e retornar (SERVICE)
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable String id) {
    }

    @PostMapping("/new")
    public SaveState savePlayer(@RequestBody String name, @RequestBody Collection<GameLog> logs) {
        //TODO: COLOCAR ISSO NO SERVICE
        return new SaveState(logs, new Player(name));
    }

    @PostMapping("/new/savestate")
    public SaveState saveState(@RequestBody SaveState saveState) {
        //TODO: COLOCAR ISSO NO SERVICE
        return null;
    }



}
