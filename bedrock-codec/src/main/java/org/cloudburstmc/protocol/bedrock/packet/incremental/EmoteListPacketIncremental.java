package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EmoteListPacket;

@Getter
@Setter
public class EmoteListPacketIncremental extends EmoteListPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int pieceIdsIndex;
    private int pieceIdsSize;
}

