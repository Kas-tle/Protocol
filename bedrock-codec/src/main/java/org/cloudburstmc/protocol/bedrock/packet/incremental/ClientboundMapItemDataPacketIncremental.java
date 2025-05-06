package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientboundMapItemDataPacket;

@Getter
@Setter
public class ClientboundMapItemDataPacketIncremental extends ClientboundMapItemDataPacket implements BedrockPacketIncremental {
    private int trackedEntityIdsIndex;
    private int trackedEntityIdsSize;

    private int trackedObjectsIndex;
    private int trackedObjectsSize;

    private int decorationsIndex;
    private int decorationsSize;

    private int uniqueMapIdIndex;
    private int uniqueMapIdSize;

    private int dimensionIdIndex;
    private int dimensionIdSize;

    private int lockedIndex;
    private int lockedSize;

    private int originIndex;
    private int originSize;

    private int scaleIndex;
    private int scaleSize;

    private int heightIndex;
    private int heightSize;

    private int widthIndex;
    private int widthSize;

    private int xOffsetIndex;
    private int xOffsetSize;

    private int yOffsetIndex;
    private int yOffsetSize;

    private int colorsIndex;
    private int colorsSize;
}

