package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.InteractPacket;

@Getter
@Setter
public class InteractPacketIncremental extends InteractPacket implements BedrockPacketIncremental {
    private int actionIndex;
    private int actionSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int mousePositionIndex;
    private int mousePositionSize;
}

