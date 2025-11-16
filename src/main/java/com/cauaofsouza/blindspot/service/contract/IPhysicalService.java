package com.cauaofsouza.blindspot.service.contract;
import com.cauaofsouza.blindspot.model.Action;
import com.cauaofsouza.blindspot.model.Damage;
import com.cauaofsouza.blindspot.model.Phase;

import java.util.Collection;

public interface IPhysicalService {
    void act(Action action);//escala de acordo com Action, metodos auxiliares, etc
    void passTime();
    void passTime(int value);
    void affectPlayer(Damage damage);
    void loadActions(Collection<Action> actions);//para settar as actions, balanceando-as de acordo com o json
    void loadPhases(Collection<Phase> phases);
    void loadDamages(Collection<Damage> damages);

}
