package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackChunkDataPacket;

@Getter
@Setter
public class ResourcePackChunkDataPacketIncremental extends ResourcePackChunkDataPacket {
    private int packIdIndex;
    private int packIdSize;

    private int packVersionIndex;
    private int packVersionSize;

    private int chunkIndexIndex;
    private int chunkIndexSize;

    private int progressIndex;
    private int progressSize;

    private int dataIndex;
    private int dataSize;
}

