package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EditorNetworkPacket;

@Getter
@Setter
public class EditorNetworkPacketIncremental extends EditorNetworkPacket implements BedrockPacketIncremental {
    private int payloadIndex;
    private int payloadSize;

    private int routeToManagerIndex;
    private int routeToManagerSize;
}
