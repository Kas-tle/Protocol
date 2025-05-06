package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TakeItemEntityPacket;

@Getter
@Setter
public class TakeItemEntityPacketIncremental extends TakeItemEntityPacket {
    private int itemRuntimeEntityIdIndex;
    private int itemRuntimeEntityIdSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
}

