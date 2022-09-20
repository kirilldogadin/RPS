package org.example.rps.second;

/**
 * Game's Session.
 */
public interface Session {

    Match newMatch();
    void sendMatchResult(Match.MatchResult result);
    Player winner();
    Status status();
    Integer matchesCount();
    interface Status {
    }
}
