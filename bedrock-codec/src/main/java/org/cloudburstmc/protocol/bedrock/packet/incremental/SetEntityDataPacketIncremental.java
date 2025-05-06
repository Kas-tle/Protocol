package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetEntityDataPacket;

@Getter
@Setter
public class SetEntityDataPacketIncremental extends SetEntityDataPacket {
    private int metadataIndex;
    private int metadataSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int tickIndex;
    private int tickSize;

    private int propertiesIndex;
    private int propertiesSize;
}

