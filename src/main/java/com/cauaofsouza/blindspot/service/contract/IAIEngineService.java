package com.cauaofsouza.blindspot.service.contract;


import java.util.Collection;

public interface IAIEngineService {
    String interpret(Collection<String> inputs);//interpreta e retorna cenário do jogador, pode retornar Classe
    void updateContext(Collection<String> inputs);//para atualizar de acordo com o contexto do player (Necessário?)

}
