package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BlockEntityDataPacket;

@Getter
@Setter
public class BlockEntityDataPacketIncremental extends BlockEntityDataPacket implements BedrockPacketIncremental {
    private int blockPositionIndex;
    private int blockPositionSize;

    private int dataIndex;
    private int dataSize;
}

