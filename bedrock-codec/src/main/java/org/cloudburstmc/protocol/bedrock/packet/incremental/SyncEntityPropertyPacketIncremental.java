package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SyncEntityPropertyPacket;

@Getter
@Setter
public class SyncEntityPropertyPacketIncremental extends SyncEntityPropertyPacket {
    private int dataIndex;
    private int dataSize;
}
