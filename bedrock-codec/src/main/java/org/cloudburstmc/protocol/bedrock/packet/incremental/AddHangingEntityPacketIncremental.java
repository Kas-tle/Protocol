package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddHangingEntityPacket;

@Getter
@Setter
public class AddHangingEntityPacketIncremental extends AddHangingEntityPacket implements BedrockPacketIncremental {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int positionIndex;
    private int positionSize;

    private int directionIndex;
    private int directionSize;
}

