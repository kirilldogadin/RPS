package org.example.rps.second;

public interface Player {
    PlayerInfo metaDataInfo();
    Id id();

    /**
     * System's ID of User
     */
    interface Id {
    }

    /**
     * meta info about player
     * can be ipmplement in another module
     */
    class PlayerInfo {
    }
}
