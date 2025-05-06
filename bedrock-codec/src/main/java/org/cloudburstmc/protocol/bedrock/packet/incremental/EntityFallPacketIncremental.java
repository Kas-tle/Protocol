package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EntityFallPacket;

@Getter
@Setter
public class EntityFallPacketIncremental extends EntityFallPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int fallDistanceIndex;
    private int fallDistanceSize;

    private int inVoidIndex;
    private int inVoidSize;
}

