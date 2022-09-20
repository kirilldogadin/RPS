package org.example.rps.first;

public class OneStepSessionRPS implements SimpleRps {
    final FigureRPS playerA;
    final FigureRPS playerB;


    public OneStepSessionRPS(FigureRPS playerA, FigureRPS playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    @Override
    public void start() {

    }

    @Override
    public Player whoWon() {
        return null;
    }

    private Player computeGame(FigureRPS playerA, FigureRPS playerB){
        return Player.A;
    }


}
