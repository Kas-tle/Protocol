package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RequestChunkRadiusPacket;

@Getter
@Setter
public class RequestChunkRadiusPacketIncremental extends RequestChunkRadiusPacket {
    private int radiusIndex;
    private int radiusSize;

    private int maxRadiusIndex;
    private int maxRadiusSize;
}

