package org.example.rps.second.realization;

import org.example.rps.second.Player;
import org.example.rps.second.Session;
import org.example.rps.second.realization.figure.Paper;
import org.example.rps.second.realization.figure.Scissors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManySessionsGameTest {

    @Test
    void newSession() {
        ManySessionsGame manySessionsGame = new ManySessionsGame();
        var a = new LocalPlayer(new LocalPlayer.LocalId(1L));
        var b = new LocalPlayer(new LocalPlayer.LocalId(2L));

        ManyMatchSession session = (ManyMatchSession) manySessionsGame.newSession(a, b);

        var status = session.status();
        System.out.println("session #" + session.matchesCount() + " status " + status);
        while (session.status.equals(ManyMatchSession.Status.IN_PROCESS)) {
            OneStepMatch match = (OneStepMatch) session.newMatch();
            match.stepA(new Scissors());
            match.stepB(new Paper());
            match.start();
            var result = match.result();

            System.out.println("match #" + session.matchesCount() + " winner " + result);
            status = session.status();
            System.out.println("session #" + session.matchesCount() + " status " + status);
        }
        status = session.status();
        System.out.println("session #" + session.matchesCount() + " status " + status);

    }
}