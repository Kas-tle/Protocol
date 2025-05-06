package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ExplodePacket;

@Getter
@Setter
public class ExplodePacketIncremental extends ExplodePacket implements BedrockPacketIncremental {
    private int recordsIndex;
    private int recordsSize;

    private int positionIndex;
    private int positionSize;

    private int radiusIndex;
    private int radiusSize;
}

