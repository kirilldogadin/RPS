package org.example.rps.second.realization.figure;

import org.example.rps.second.figure.Figure;

public class Paper implements Figure {

    @Override
    public Result fight(Figure figure) {
        if (figure instanceof Rock) return Result.WIN;
        if (figure instanceof Scissors) return Result.LOSS;
        if (figure instanceof Paper) return Result.DRAW;
        throw new RuntimeException("Unknown figure");
    }
}
