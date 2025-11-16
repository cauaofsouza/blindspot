package com.cauaofsouza.blindspot.service;
import com.cauaofsouza.blindspot.model.Action;
import com.cauaofsouza.blindspot.model.Damage;
import com.cauaofsouza.blindspot.model.Phase;
import com.cauaofsouza.blindspot.service.contract.IPhysicalService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PhysicalService implements IPhysicalService {
    //criar listas

    @Override
    public void act(Action action) {

    }

    @Override
    public void passTime() {

    }

    @Override
    public void passTime(int value) {

    }

    @Override
    public void affectPlayer(Damage damage) {

    }

    @Override
    public void loadActions(Collection<Action> actions) {

    }

    @Override
    public void loadPhases(Collection<Phase> phases) {

    }

    @Override
    public void loadDamages(Collection<Damage> damages) {

    }
}
