package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MapCreateLockedCopyPacket;

@Getter
@Setter
public class MapCreateLockedCopyPacketIncremental extends MapCreateLockedCopyPacket implements BedrockPacketIncremental {
    private int originalMapIdIndex;
    private int originalMapIdSize;

    private int newMapIdIndex;
    private int newMapIdSize;
}

