package org.example.rps.second.realization;

import org.example.rps.second.Match;
import org.example.rps.second.Player;
import org.example.rps.second.Session;
import org.example.rps.second.figure.Figure;

/**
 * схватка в один ход
 */
//TODO настроить копирайт
public class OneStepMatch implements Match {

    final Session session;
    Result matchResult;
    Figure a;
    Figure b;

    public OneStepMatch(Session session) {
        this.session = session;
    }

    @Override
    public void stepA(Figure figureA) {
        a = figureA;
    }

    @Override
    public void stepB(Figure figureB) {
        b = figureB;
    }

    @Override
    public void start() {
        Figure.Result figureFightResult = a.fight(b);
        matchResult = toMatchResult(figureFightResult);
        session.sendMatchResult(matchResult);
    }

    @Override
    public MatchResult result() {
        return toMatchResult(a.fight(b));
    }

    private Result toMatchResult(Figure.Result figureFightResult) {
        if (figureFightResult.equals(Figure.Result.WIN)) return Result.A_WIN;
        if (figureFightResult.equals(Figure.Result.LOSS)) return Result.B_WIN;
        if (figureFightResult.equals(Figure.Result.DRAW)) return Result.DRAW;
        throw new RuntimeException("unknown result");
    }


    enum Result implements Match.MatchResult {
        A_WIN,
        B_WIN,
        DRAW;
    }


}
