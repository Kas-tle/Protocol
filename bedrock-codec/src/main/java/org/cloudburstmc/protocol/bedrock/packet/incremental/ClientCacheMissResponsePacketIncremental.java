package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientCacheMissResponsePacket;

@Getter
@Setter
public class ClientCacheMissResponsePacketIncremental extends ClientCacheMissResponsePacket implements BedrockPacketIncremental {
    private int blobsIndex;
    private int blobsSize;
}

