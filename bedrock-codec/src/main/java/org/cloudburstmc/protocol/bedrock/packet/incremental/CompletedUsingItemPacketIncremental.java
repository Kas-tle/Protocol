package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CompletedUsingItemPacket;

@Getter
@Setter
public class CompletedUsingItemPacketIncremental extends CompletedUsingItemPacket implements BedrockPacketIncremental {
    private int itemIdIndex;
    private int itemIdSize;

    private int typeIndex;
    private int typeSize;
}
