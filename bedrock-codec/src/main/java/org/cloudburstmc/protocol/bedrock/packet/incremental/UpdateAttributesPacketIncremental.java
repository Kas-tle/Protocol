package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateAttributesPacket;

@Getter
@Setter
public class UpdateAttributesPacketIncremental extends UpdateAttributesPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int attributesIndex;
    private int attributesSize;

    private int tickIndex;
    private int tickSize;
}

