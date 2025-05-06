package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UnknownPacket;

@Getter
@Setter
public class UnknownPacketIncremental extends UnknownPacket {
    private int packetIdIndex;
    private int packetIdSize;

    private int payloadIndex;
    private int payloadSize;
}

