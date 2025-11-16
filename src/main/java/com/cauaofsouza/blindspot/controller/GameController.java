package com.cauaofsouza.blindspot.controller;

import com.cauaofsouza.blindspot.service.contract.IAIEngineService;
import com.cauaofsouza.blindspot.service.contract.IPhysicalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game/action")
@RequiredArgsConstructor
public class GameController {
    private final IAIEngineService engineService;
    private final IPhysicalService phisicalService;

    //o controller vai usar os services para o jogo funcionar
}
