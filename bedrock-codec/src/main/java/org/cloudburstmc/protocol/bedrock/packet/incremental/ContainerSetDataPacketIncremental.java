package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ContainerSetDataPacket;

@Getter
@Setter
public class ContainerSetDataPacketIncremental extends ContainerSetDataPacket implements BedrockPacketIncremental {
    private int windowIdIndex;
    private int windowIdSize;

    private int propertyIndex;
    private int propertySize;

    private int valueIndex;
    private int valueSize;
}

