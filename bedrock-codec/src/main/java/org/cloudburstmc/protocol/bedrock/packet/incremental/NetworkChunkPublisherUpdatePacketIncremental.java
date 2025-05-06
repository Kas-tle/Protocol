package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NetworkChunkPublisherUpdatePacket;

@Getter
@Setter
public class NetworkChunkPublisherUpdatePacketIncremental extends NetworkChunkPublisherUpdatePacket {
    private int positionIndex;
    private int positionSize;

    private int radiusIndex;
    private int radiusSize;

    private int savedChunksIndex;
    private int savedChunksSize;
}

