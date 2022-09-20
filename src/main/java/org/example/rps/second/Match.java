package org.example.rps.second;

import org.example.rps.second.figure.Figure;

/**
 * Game's session's step
 */
public interface Match {

    void stepA(Figure figure);

    void stepB(Figure figure);

    void start();

    MatchResult result();

    interface MatchResult {};

}
