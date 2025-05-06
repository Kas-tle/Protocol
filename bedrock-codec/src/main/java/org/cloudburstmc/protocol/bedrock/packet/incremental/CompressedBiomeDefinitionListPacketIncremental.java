package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CompressedBiomeDefinitionListPacket;

@Getter
@Setter
public class CompressedBiomeDefinitionListPacketIncremental extends CompressedBiomeDefinitionListPacket implements BedrockPacketIncremental {
    private int definitionsIndex;
    private int definitionsSize;
}

