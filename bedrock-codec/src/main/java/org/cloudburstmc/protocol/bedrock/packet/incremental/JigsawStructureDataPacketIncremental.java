package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.JigsawStructureDataPacket;

@Getter
@Setter
public class JigsawStructureDataPacketIncremental extends JigsawStructureDataPacket implements BedrockPacketIncremental {
    private int jigsawStructureDataTagIndex;
    private int jigsawStructureDataTagSize;
}
