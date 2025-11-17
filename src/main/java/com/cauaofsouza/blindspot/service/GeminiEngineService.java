package com.cauaofsouza.blindspot.service;
import com.cauaofsouza.blindspot.service.contract.IAIEngineService;
import com.google.genai.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class GeminiEngineService implements IAIEngineService {

    private final Client geminiClient;

    @Override
    public String interpret(Collection<String> inputs) {
        return "";
    }


    @Override
    public void updateContext(Collection<String> inputs) {

    }
}
