package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LabTablePacket;

@Getter
@Setter
public class LabTablePacketIncremental extends LabTablePacket implements BedrockPacketIncremental {
    private int typeIndex;
    private int typeSize;

    private int positionIndex;
    private int positionSize;

    private int reactionTypeIndex;
    private int reactionTypeSize;
}

