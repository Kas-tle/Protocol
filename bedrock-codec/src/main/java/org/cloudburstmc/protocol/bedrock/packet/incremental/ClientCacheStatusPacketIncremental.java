package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientCacheStatusPacket;

@Getter
@Setter
public class ClientCacheStatusPacketIncremental extends ClientCacheStatusPacket implements BedrockPacketIncremental {
    private int supportedIndex;
    private int supportedSize;
}