package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RemoveEntityPacket;

@Getter
@Setter
public class RemoveEntityPacketIncremental extends RemoveEntityPacket {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;
}

