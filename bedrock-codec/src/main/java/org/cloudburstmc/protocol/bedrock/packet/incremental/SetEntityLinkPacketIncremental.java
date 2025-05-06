package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetEntityLinkPacket;

@Getter
@Setter
public class SetEntityLinkPacketIncremental extends SetEntityLinkPacket {
    private int entityLinkIndex;
    private int entityLinkSize;
}

