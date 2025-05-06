package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateBlockPropertiesPacket;

@Getter
@Setter
public class UpdateBlockPropertiesPacketIncremental extends UpdateBlockPropertiesPacket {
    private int propertiesIndex;
    private int propertiesSize;
}

