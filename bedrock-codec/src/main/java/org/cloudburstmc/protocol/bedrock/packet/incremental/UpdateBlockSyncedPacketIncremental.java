package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBlockSyncedPacketIncremental extends UpdateBlockPropertiesPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int entityBlockSyncTypeIndex;
    private int entityBlockSyncTypeSize;
}
