package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ChangeDimensionPacket;

@Getter
@Setter
public class ChangeDimensionPacketIncremental extends ChangeDimensionPacket implements BedrockPacketIncremental {
    private int dimensionIndex;
    private int dimensionSize;

    private int positionIndex;
    private int positionSize;

    private int respawnIndex;
    private int respawnSize;

    private int loadingScreenIdIndex;
    private int loadingScreenIdSize;
}

