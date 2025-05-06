package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SubChunkPacket;

@Getter
@Setter
public class SubChunkPacketIncremental extends SubChunkPacket {
    private int dimensionIndex;
    private int dimensionSize;

    private int cacheEnabledIndex;
    private int cacheEnabledSize;

    private int centerPositionIndex;
    private int centerPositionSize;

    private int subChunksIndex;
    private int subChunksSize;
}

