package com.cauaofsouza.blindspot.service.contract;


import java.util.Collection;

public interface IAIEngineService {
    String interpret(Collection<String> inputs);//interpreta e retorna cenário do jogador, pode retornar Classe
    void getPrompt(Collection<String> inputs);//pega o prompt e salva em memória
    void updateContext(Collection<String> inputs);//para atualizar de acordo com o contexto do player (Necessário?)

}
