package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetLastHurtByPacket;

@Getter
@Setter
public class SetLastHurtByPacketIncremental extends SetLastHurtByPacket {
    private int entityTypeIdIndex;
    private int entityTypeIdSize;
}

