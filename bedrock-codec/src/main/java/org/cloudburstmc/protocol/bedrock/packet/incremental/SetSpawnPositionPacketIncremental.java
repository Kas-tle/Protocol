package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetSpawnPositionPacket;

@Getter
@Setter
public class SetSpawnPositionPacketIncremental extends SetSpawnPositionPacket {
    private int spawnTypeIndex;
    private int spawnTypeSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int dimensionIdIndex;
    private int dimensionIdSize;

    private int spawnPositionIndex;
    private int spawnPositionSize;

    private int spawnForcedIndex;
    private int spawnForcedSize;
}

