package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MoveEntityAbsolutePacket;

@Getter
@Setter
public class MoveEntityAbsolutePacketIncremental extends MoveEntityAbsolutePacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int positionIndex;
    private int positionSize;

    private int rotationIndex;
    private int rotationSize;

    private int onGroundIndex;
    private int onGroundSize;

    private int teleportedIndex;
    private int teleportedSize;

    private int forceMoveIndex;
    private int forceMoveSize;
}

