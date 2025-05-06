package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.DebugInfoPacket;

@Getter
@Setter
public class DebugInfoPacketIncremental extends DebugInfoPacket implements BedrockPacketIncremental {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int dataIndex;
    private int dataSize;
}

