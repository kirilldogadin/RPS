package org.example.rps.second.realization;

import org.example.rps.second.Match;
import org.example.rps.second.Player;
import org.example.rps.second.Session;

public class ManyMatchSession implements Session {

    public final Integer MAX_COUNT_OF_WIN = 3;
    public final Integer MAX_COUNT_OF_MATCHES = 4;

    Status status = Status.IN_PROCESS;
    Player winner;

    /**
     * текущий матч
     */
    private Match currentMatch;
    private Integer aWins = 0;
    private Integer bWins = 0;
    private Integer draw = 0;

    private Integer matchesCount = 0;

    public void aWins() {
        //validate
        aWins += 1;
    }

    public void bWins() {
        //validate
        bWins += 1;
    }

    public void draw() {
        //validate
        draw += 0;
    }

    public void isMaxMatches() {

    }

    final Player playerA;
    final Player playerB;
    final Player nobody = new LocalPlayer(new LocalPlayer.LocalId(-1L));

    public ManyMatchSession(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    @Override
    public Match newMatch() {
        return new OneStepMatch(this);
    }

    @Override
    //TODO для упрощения а надо ли отделный реузльтат или можно отправить себя?
    //список матчей храним? -
    //соотносим результат и нужную схватку если будет список схваток
    public void sendMatchResult(Match.MatchResult result) {
        //проставить нужную статистику
        //TODO методы эти и метод isWins() дублируют друг друга?
        if (result.equals(OneStepMatch.Result.A_WIN)) aWins();
        if (result.equals(OneStepMatch.Result.B_WIN)) bWins();
        if (result.equals(OneStepMatch.Result.DRAW)) draw();
        ++matchesCount;

        if (aWins >= MAX_COUNT_OF_WIN) {
            winner = playerA;
            status = Status.WINNER_A;
        }

        if (bWins >= MAX_COUNT_OF_WIN) {
            winner = playerB;
            status = Status.WINNER_B;
        }

        if (matchesCount > MAX_COUNT_OF_MATCHES) {
            winner = nobody;
            status = Status.OUT_OF_LIMIT;
        }

    }

    @Override
    public Player winner() {
        return winner;
    }

    @Override
    public Status status() {
        return status;
    }

    @Override
    public Integer matchesCount() {
        return matchesCount;
    }


    enum Status implements Session.Status {
        WINNER_A,
        WINNER_B,
        DRAW,
        IN_PROCESS,
        OUT_OF_LIMIT,
        INACTIVE;
    }

}
