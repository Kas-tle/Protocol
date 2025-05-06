package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EntityPickRequestPacket;

@Getter
@Setter
public class EntityPickRequestPacketIncremental extends EntityPickRequestPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int hotbarSlotIndex;
    private int hotbarSlotSize;

    private int withDataIndex;
    private int withDataSize;
}

