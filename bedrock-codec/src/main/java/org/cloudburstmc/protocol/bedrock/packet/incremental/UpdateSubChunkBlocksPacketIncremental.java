package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateSubChunkBlocksPacket;

@Getter
@Setter
public class UpdateSubChunkBlocksPacketIncremental extends UpdateSubChunkBlocksPacket {
    private int chunkXIndex;
    private int chunkXSize;

    private int chunkYIndex;
    private int chunkYSize;

    private int chunkZIndex;
    private int chunkZSize;

    private int standardBlocksIndex;
    private int standardBlocksSize;

    private int extraBlocksIndex;
    private int extraBlocksSize;
}

