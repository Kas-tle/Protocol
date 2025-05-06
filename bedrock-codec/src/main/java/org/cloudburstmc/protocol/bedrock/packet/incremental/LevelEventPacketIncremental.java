package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LevelEventPacket;

@Getter
@Setter
public class LevelEventPacketIncremental extends LevelEventPacket implements BedrockPacketIncremental {
    private int typeIndex;
    private int typeSize;

    private int positionIndex;
    private int positionSize;

    private int dataIndex;
    private int dataSize;
}

