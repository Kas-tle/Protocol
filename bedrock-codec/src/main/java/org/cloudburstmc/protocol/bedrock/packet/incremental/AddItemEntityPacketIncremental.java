package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddItemEntityPacket;

@Getter
@Setter
public class AddItemEntityPacketIncremental extends AddItemEntityPacket implements BedrockPacketIncremental {
    private int metadataIndex;
    private int metadataSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int itemInHandIndex;
    private int itemInHandSize;

    private int positionIndex;
    private int positionSize;

    private int motionIndex;
    private int motionSize;

    private int fromFishingIndex;
    private int fromFishingSize;
}

