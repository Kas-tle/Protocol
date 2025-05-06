package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RespawnPacket;

@Getter
@Setter
public class RespawnPacketIncremental extends RespawnPacket {
    private int positionIndex;
    private int positionSize;

    private int stateIndex;
    private int stateSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
}

