package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerActionPacket;

@Getter
@Setter
public class PlayerActionPacketIncremental extends PlayerActionPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
    
    private int actionIndex;
    private int actionSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int resultPositionIndex;
    private int resultPositionSize;

    private int faceIndex;
    private int faceSize;
}

