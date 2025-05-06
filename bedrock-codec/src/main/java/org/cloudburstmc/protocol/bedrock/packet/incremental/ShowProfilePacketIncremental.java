package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ShowProfilePacket;

@Getter
@Setter
public class ShowProfilePacketIncremental extends ShowProfilePacket {
    private int xuidIndex;
    private int xuidSize;
}

