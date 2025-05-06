package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SubChunkRequestPacket;

@Getter
@Setter
public class SubChunkRequestPacketIncremental extends SubChunkRequestPacket {
    private int dimensionIndex;
    private int dimensionSize;

    private int subChunkPositionIndex;
    private int subChunkPositionSize;

    private int positionOffsetsIndex;
    private int positionOffsetsSize;
}

