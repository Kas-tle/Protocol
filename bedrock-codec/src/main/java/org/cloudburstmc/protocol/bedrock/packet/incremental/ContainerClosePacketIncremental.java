package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ContainerClosePacket;

@Getter
@Setter
public class ContainerClosePacketIncremental extends ContainerClosePacket implements BedrockPacketIncremental {
    private int idIndex;
    private int idSize;

    private int serverInitiatedIndex;
    private int serverInitiatedSize;

    private int typeIndex;
    private int typeSize;
}

