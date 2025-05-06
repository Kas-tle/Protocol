package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CurrentStructureFeaturePacket;

@Getter
@Setter
public class CurrentStructureFeaturePacketIncremental extends CurrentStructureFeaturePacket implements BedrockPacketIncremental {
    private int currentStructureFeatureIndex;
    private int currentStructureFeatureSize;
}
