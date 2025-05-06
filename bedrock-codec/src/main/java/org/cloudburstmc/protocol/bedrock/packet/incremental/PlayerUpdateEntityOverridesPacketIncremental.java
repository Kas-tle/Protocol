package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerUpdateEntityOverridesPacket;

@Getter
@Setter
public class PlayerUpdateEntityOverridesPacketIncremental extends PlayerUpdateEntityOverridesPacket {
    private int entityUniqueIdIndex;
    private int entityUniqueIdSize;
    
    private int propertyIndexIndex;
    private int propertyIndexSize;

    private int updateTypeIndex;
    private int updateTypeSize;

    private int intValueIndex;
    private int intValueSize;

    private int floatValueIndex;
    private int floatValueSize;
}
