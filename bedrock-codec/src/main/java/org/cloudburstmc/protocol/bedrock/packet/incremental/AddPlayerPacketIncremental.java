package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddPlayerPacket;

@Getter
@Setter
public class AddPlayerPacketIncremental extends AddPlayerPacket implements BedrockPacketIncremental {
    private int metadataIndex;
    private int metadataSize;

    private int entityLinksIndex;
    private int entityLinksSize;

    private int uuidIndex;
    private int uuidSize;

    private int usernameIndex;
    private int usernameSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int platformChatIdIndex;
    private int platformChatIdSize;

    private int positionIndex;
    private int positionSize;

    private int motionIndex;
    private int motionSize;

    private int rotationIndex;
    private int rotationSize;

    private int handIndex;
    private int handSize;

    private int adventureSettingsIndex;
    private int adventureSettingsSize;

    private int deviceIdIndex;
    private int deviceIdSize;

    private int buildPlatformIndex;
    private int buildPlatformSize;

    private int gameTypeIndex;
    private int gameTypeSize;

    private int abilityLayersIndex;
    private int abilityLayersSize;
    
    private int propertiesIndex;
    private int propertiesSize;
}

