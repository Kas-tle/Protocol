package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LecternUpdatePacket;

@Getter
@Setter
public class LecternUpdatePacketIncremental extends LecternUpdatePacket implements BedrockPacketIncremental {
    private int pageIndex;
    private int pageSize;

    private int totalPagesIndex;
    private int totalPagesSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int droppingBookIndex;
    private int droppingBookSize;
}

