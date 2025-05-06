package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddEntityPacket;

@Getter
@Setter
public class AddEntityPacketIncremenetal extends AddEntityPacket implements BedrockPacketIncremental {
    private int attributesIndex;
    private int attributesSize;

    private int metadataIndex;
    private int metadataSize;

    private int entityLinksIndex;
    private int entityLinksSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int identifierIndex;
    private int identifierSize;

    private int entityTypeIndex;
    private int entityTypeSize;

    private int positionIndex;
    private int positionSize;

    private int motionIndex;
    private int motionSize;

    private int rotationIndex;
    private int rotationSize;

    private int headRotationIndex;
    private int headRotationSize;

    private int bodyRotationIndex;
    private int bodyRotationSize;

    private int propertiesIndex;
    private int propertiesSize;
}

