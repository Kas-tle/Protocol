package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackChunkRequestPacket;

@Getter
@Setter
public class ResourcePackChunkRequestPacketIncremental extends ResourcePackChunkRequestPacket {
    private int packIdIndex;
    private int packIdSize;

    private int packVersionIndex;
    private int packVersionSize;

    private int chunkIndexIndex;
    private int chunkIndexSize;
}

