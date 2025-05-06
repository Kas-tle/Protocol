package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EntityEventPacket;

@Getter
@Setter
public class EntityEventPacketIncremental extends EntityEventPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int typeIndex;
    private int typeSize;

    private int dataIndex;
    private int dataSize;
}