package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackDataInfoPacket;

@Getter
@Setter
public class ResourcePackDataInfoPacketIncremental extends ResourcePackDataInfoPacket {
    private int packIdIndex;
    private int packIdSize;

    private int packVersionIndex;
    private int packVersionSize;

    private int maxChunkSizeIndex;
    private int maxChunkSizeSize;

    private int chunkCountIndex;
    private int chunkCountSize;

    private int compressedPackSizeIndex;
    private int compressedPackSizeSize;

    private int hashIndex;
    private int hashSize;

    private int premiumIndex;
    private int premiumSize;

    private int typeIndex;
    private int typeSize;
}

