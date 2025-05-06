package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.OpenSignPacket;

@Getter
@Setter
public class OpenSignPacketIncremental extends OpenSignPacket {
    private int positionIndex;
    private int positionSize;

    private int frontSideIndex;
    private int frontSideSize;
}

