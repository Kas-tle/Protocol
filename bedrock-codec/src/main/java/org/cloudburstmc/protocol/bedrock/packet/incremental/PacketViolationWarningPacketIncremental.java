package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PacketViolationWarningPacket;

@Getter
@Setter
public class PacketViolationWarningPacketIncremental extends PacketViolationWarningPacket {
    private int typeIndex;
    private int typeSize;

    private int severityIndex;
    private int severitySize;

    private int packetCauseIdIndex;
    private int packetCauseIdSize;
    
    private int contextIndex;
    private int contextSize;
}

