package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ContainerOpenPacket;

@Getter
@Setter
public class ContainerOpenPacketIncremental extends ContainerOpenPacket implements BedrockPacketIncremental {
    private int idIndex;
    private int idSize;

    private int typeIndex;
    private int typeSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;
}

