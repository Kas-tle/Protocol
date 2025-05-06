package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AnimatePacket;

@Getter
@Setter
public class AnimatePacketIncremental extends AnimatePacket implements BedrockPacketIncremental {
    private float rowingTimeIndex;
    private float rowingTimeSize;

    private int actionIndex;
    private int actionSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
}

