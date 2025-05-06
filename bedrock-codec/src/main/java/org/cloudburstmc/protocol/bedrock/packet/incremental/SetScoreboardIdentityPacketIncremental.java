package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetScoreboardIdentityPacket;

import java.util.UUID;

@Getter
@Setter
public class SetScoreboardIdentityPacketIncremental extends SetScoreboardIdentityPacket {
    private int entriesIndex;
    private int entriesSize;

    private int actionIndex;
    private int actionSize;

    @Getter
    @Setter
    public static class Entry extends SetScoreboardIdentityPacket.Entry {
        Entry(long scoreboardId, UUID uuid) {
            super(scoreboardId, uuid);
        }

        private int scoreboardIdIndex;
        private int scoreboardIdSize;

        private int uuidIndex;
        private int uuidSize;
    }
}

