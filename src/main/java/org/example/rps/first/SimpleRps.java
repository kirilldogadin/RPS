package org.example.rps.first;

public interface SimpleRps {
    void start();
    Player whoWon();
    enum Player {
        A,
        B;
    }
    enum FigureRPS {
        ROCK,
        PAPER,
        SCISSORS;
    }
}
