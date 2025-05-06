package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LevelChunkPacket;

@Getter
@Setter
public class LevelChunkPacketIncremental extends LevelChunkPacket implements BedrockPacketIncremental {
    private int chunkXIndex;
    private int chunkXSize;

    private int chunkZIndex;
    private int chunkZSize;

    private int subChunksLengthIndex;
    private int subChunksLengthSize;

    private int cachingEnabledIndex;
    private int cachingEnabledSize;

    private int requestSubChunksIndex;
    private int requestSubChunksSize;

    private int subChunkLimitIndex;
    private int subChunkLimitSize;

    private int blobIdsIndex;
    private int blobIdsSize;

    private int dataIndex;
    private int dataSize;

    private int dimensionIndex;
    private int dimensionSize;
}

