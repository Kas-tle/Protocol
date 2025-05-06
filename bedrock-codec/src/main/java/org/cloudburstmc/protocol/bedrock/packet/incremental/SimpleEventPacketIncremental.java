package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SimpleEventPacket;

@Getter
@Setter
public class SimpleEventPacketIncremental extends SimpleEventPacket {
    private int eventIndex;
    private int eventSize;
}

