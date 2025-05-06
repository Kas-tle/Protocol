package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerListPacket;

import java.util.UUID;

@Getter
@Setter
public class PlayerListPacketIncremental extends PlayerListPacket {
    private int entriesIndex;
    private int entriesSize;

    private int actionIndex;
    private int actionSize;

    @Getter
    @Setter
    public static class Entry extends PlayerListPacket.Entry {
        Entry(
                UUID uuid
        ) {
            super(uuid);
        }

        private int uuidIndex;
        private int uuidSize;

        private int entityIdIndex;
        private int entityIdSize;

        private int nameIndex;
        private int nameSize;

        private int xuidIndex;
        private int xuidSize;

        private int platformChatIdIndex;
        private int platformChatIdSize;

        private int buildPlatformIndex;
        private int buildPlatformSize;

        private int skinIndex;
        private int skinSize;

        private int teacherIndex;
        private int teacherSize;

        private int hostIndex;
        private int hostSize;

        private int trustedSkinIndex;
        private int trustedSkinSize;

        private int subClientIndex;
        private int subClientSize;
    }
}

