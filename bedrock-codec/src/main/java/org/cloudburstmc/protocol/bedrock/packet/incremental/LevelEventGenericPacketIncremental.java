package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LevelEventGenericPacket;

@Getter
@Setter
public class LevelEventGenericPacketIncremental extends LevelEventGenericPacket implements BedrockPacketIncremental {
    private int typeIndex;
    private int typeSize;

    private int tagIndex;
    private int tagSize;
}

