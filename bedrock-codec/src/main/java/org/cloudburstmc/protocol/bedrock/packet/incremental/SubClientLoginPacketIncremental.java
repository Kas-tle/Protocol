package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SubClientLoginPacket;

@Getter
@Setter
public class SubClientLoginPacketIncremental extends SubClientLoginPacket {
    private int chainIndex;
    private int chainSize;

    private int extraIndex;
    private int extraSize;
}

