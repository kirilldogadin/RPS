package org.example.rps.second.realization.figure;

import org.example.rps.second.figure.Figure;

public class Scissors implements Figure {

    //TODO заменить сравнение классов на веса?
    Integer weight;

    @Override
    public Result fight(Figure figure) {
        if (figure instanceof Paper) return Result.WIN;
        if (figure instanceof Rock) return Result.LOSS;
        if (figure instanceof Scissors) return Result.DRAW;
        throw new RuntimeException("Unknown figure");
    }
}
