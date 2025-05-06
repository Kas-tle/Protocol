package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NpcRequestPacket;

@Getter
@Setter
public class NpcRequestPacketIncremental extends NpcRequestPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int requestTypeIndex;
    private int requestTypeSize;

    private int commandIndex;
    private int commandSize;

    private int actionTypeIndex;
    private int actionTypeSize;

    private int sceneNameIndex;
    private int sceneNameSize;
}

