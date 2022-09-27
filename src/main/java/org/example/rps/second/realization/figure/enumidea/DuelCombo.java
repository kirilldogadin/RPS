package org.example.rps.second.realization.figure.enumidea;

import org.example.rps.second.figure.Figure;

/**
 *
 */
public enum DuelCombo {

    ROCK_ROCK(0, 0),
    ROCK_PAPER(0, 1),
    ROCK_SCISSORS(0, 2),

    PAPER_ROCK(1, 0),
    PAPER_PAPER(1, 1),
    PAPER_SCISSORS(1, 2),

    SCISSORS_ROCK(2, 0),
    SCISSORS_PAPER(2, 1),
    SCISSORS_SCISSORS(2, 2);

    //todo matrix of result - 00 - draw, 01 - loss, 02 - win can be as table in DataBase

    DuelCombo(int a, int b){
         this.a = a;
         this.b = b;
     }

    private final int a;
    private final int b;
}
