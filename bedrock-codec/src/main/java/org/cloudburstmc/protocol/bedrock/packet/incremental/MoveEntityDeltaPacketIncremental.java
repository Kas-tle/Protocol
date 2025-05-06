package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MoveEntityDeltaPacket;

@Getter
@Setter
public class MoveEntityDeltaPacketIncremental extends MoveEntityDeltaPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int flagsIndex;
    private int flagsSize;

    private int deltaXIndex;
    private int deltaXSize;

    private int deltaYIndex;
    private int deltaYSize;

    private int deltaZIndex;
    private int deltaZSize;

    private int xIndex;
    private int xSize;

    private int yIndex;
    private int ySize;

    private int zIndex;
    private int zSize;

    private int pitchIndex;
    private int pitchSize;

    private int yawIndex;
    private int yawSize;

    private int headYawIndex;
    private int headYawSize;
}

