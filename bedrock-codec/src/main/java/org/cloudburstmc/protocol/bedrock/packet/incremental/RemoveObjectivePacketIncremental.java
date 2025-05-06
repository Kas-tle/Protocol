package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RemoveObjectivePacket;

@Getter
@Setter
public class RemoveObjectivePacketIncremental extends RemoveObjectivePacket {
    private int objectiveIdIndex;
    private int objectiveIdSize;
}

