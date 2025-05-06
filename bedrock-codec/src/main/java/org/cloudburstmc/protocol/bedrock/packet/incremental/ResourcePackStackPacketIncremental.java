package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackStackPacket;

@Getter
@Setter
public class ResourcePackStackPacketIncremental extends ResourcePackStackPacket {
    private int forcedToAcceptIndex;
    private int forcedToAcceptSize;

    private int behaviorPacksIndex;
    private int behaviorPacksSize;

    private int resourcePacksIndex;
    private int resourcePacksSize;

    private int gameVersionIndex;
    private int gameVersionSize;

    private int experimentsIndex;
    private int experimentsSize;

    private int experimentsPreviouslyToggledIndex;
    private int experimentsPreviouslyToggledSize;

    private int hasEditorPacksIndex;
    private int hasEditorPacksSize;

    @Getter
    @Setter
    public static class Entry extends ResourcePackStackPacket.Entry {
        Entry(
                String packId,
                String packVersion,
                String subPackName
        ) {
            super(packId, packVersion, subPackName);
        }

        private int packIdIndex;
        private int packIdSize;

        private int packVersionIndex;
        private int packVersionSize;

        private int subPackNameIndex;
        private int subPackNameSize;
    }
}

