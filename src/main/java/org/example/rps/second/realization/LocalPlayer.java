package org.example.rps.second.realization;

import org.example.rps.second.Player;

public class LocalPlayer implements Player {
    Id id;

    public LocalPlayer(Id id) {
        this.id = id;
    }

    public LocalPlayer() {
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    @Override
    public PlayerInfo metaDataInfo() {
        return null;
    }

    @Override
    public Id id() {
        return null;
    }

    static class LocalId implements Id {
        final long id;

        LocalId(long id) {
            this.id = id;
        }
    }
}
