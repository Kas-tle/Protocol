package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EventPacket;

@Getter
@Setter
public class EventPacketIncremental extends EventPacket implements BedrockPacketIncremental {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;
    
    private int usePlayerIdIndex;
    private int usePlayerIdSize;
    
    private int eventDataIndex;
    private int eventDataSize;
}

