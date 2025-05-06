package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ChunkRadiusUpdatedPacket;

@Getter
@Setter
public class ChunkRadiusUpdatedPacketIncremental extends ChunkRadiusUpdatedPacket implements BedrockPacketIncremental {
    private int radiusIndex;
    private int radiusSize;
}

