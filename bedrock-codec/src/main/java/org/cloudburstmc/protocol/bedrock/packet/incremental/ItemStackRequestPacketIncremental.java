package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ItemStackRequestPacket;

@Getter
@Setter
public class ItemStackRequestPacketIncremental extends ItemStackRequestPacket implements BedrockPacketIncremental {
    private int requestsIndex;
    private int requestsSize;
}

