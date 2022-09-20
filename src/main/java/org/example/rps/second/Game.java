package org.example.rps.second;

import org.example.rps.first.SimpleRps;

public interface Game {
    /**
     *
     * @return new Session of Game
     */
    Session newSession(Player A, Player B);
}
