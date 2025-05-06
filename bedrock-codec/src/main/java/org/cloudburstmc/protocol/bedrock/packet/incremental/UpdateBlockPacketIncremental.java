package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateBlockPacket;

@Getter
@Setter
public class UpdateBlockPacketIncremental extends UpdateBlockPacket {
    private int flagsIndex;
    private int flagsSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int definitionIndex;
    private int definitionSize;

    private int dataLayerIndex;
    private int dataLayerSize;
}

