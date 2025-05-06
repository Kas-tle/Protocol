package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ResourcePackClientResponsePacket;

@Getter
@Setter
public class ResourcePackClientResponsePacketIncremental extends ResourcePackClientResponsePacket {
    private int packIdsIndex;
    private int packIdsSize;

    private int statusIndex;
    private int statusSize;
}

