package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SimulationTypePacket;

@Getter
@Setter
public class SimulationTypePacketIncremental extends SimulationTypePacket {
    private int typeIndex;
    private int typeSize;
}
