package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientCacheBlobStatusPacket;

@Getter
@Setter
public class ClientCacheBlobStatusPacketIncremental extends ClientCacheBlobStatusPacket implements BedrockPacketIncremental {
    private int acksIndex;
    private int acksSize;

    private int naksIndex;
    private int naksSize;
}

