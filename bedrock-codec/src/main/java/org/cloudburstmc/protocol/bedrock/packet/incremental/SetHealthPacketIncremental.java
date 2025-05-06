package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetHealthPacket;

@Getter
@Setter
public class SetHealthPacketIncremental extends SetHealthPacket {
    private int healthIndex;
    private int healthSize;
}

