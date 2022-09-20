package org.example.rps.second.realization;

import org.example.rps.second.Game;
import org.example.rps.second.Player;
import org.example.rps.second.Session;

public class ManySessionsGame implements Game {


    @Override
    public Session newSession(Player a, Player b) {
        return new ManyMatchSession(a,b);
    }


}
