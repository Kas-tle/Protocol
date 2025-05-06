package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BlockPickRequestPacket;

@Getter
@Setter
public class BlockPickRequestPacketIncremental extends BlockPickRequestPacket implements BedrockPacketIncremental {
    private int blockPositionIndex;
    private int blockPositionSize;

    private int addUserDataIndex;
    private int addUserDataSize;

    private int hotbarSlotIndex;
    private int hotbarSlotSize;
}

