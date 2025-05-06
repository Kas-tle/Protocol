package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.FilterTextPacket;

@Getter
@Setter
public class FilterTextPacketIncremental extends FilterTextPacket implements BedrockPacketIncremental {
    private int textIndex;
    private int textSize;

    private int fromServerIndex;
    private int fromServerSize;
}

