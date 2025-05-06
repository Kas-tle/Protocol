package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BiomeDefinitionListPacket;

@Getter
@Setter
public class BiomeDefinitionListPacketIncremental extends BiomeDefinitionListPacket implements BedrockPacketIncremental {
    private int definitionsIndex;
    private int definitionsSize;
}

