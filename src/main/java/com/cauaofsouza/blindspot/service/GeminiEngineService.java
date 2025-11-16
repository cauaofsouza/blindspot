package com.cauaofsouza.blindspot.service;
import com.cauaofsouza.blindspot.service.contract.IAIEngineService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class GeminiEngineService implements IAIEngineService {

    @Override
    public String interpret(Collection<String> inputs) {
        return "";
    }

    @Override
    public void getPrompt(Collection<String> inputs) {

    }

    @Override
    public void updateContext(Collection<String> inputs) {

    }
}
