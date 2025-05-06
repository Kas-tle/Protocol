package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetTimePacket;

@Getter
@Setter
public class SetTimePacketIncremental extends SetTimePacket {
    private int timeIndex;
    private int timeSize;
}

