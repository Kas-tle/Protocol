package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateClientInputLocksPacket;

@Getter
@Setter
public class UpdateClientInputLocksPacketIncremental extends UpdateClientInputLocksPacket {
    private int lockComponentDataIndex;
    private int lockComponentDataSize;

    private int serverPositionIndex;
    private int serverPositionSize;
}

