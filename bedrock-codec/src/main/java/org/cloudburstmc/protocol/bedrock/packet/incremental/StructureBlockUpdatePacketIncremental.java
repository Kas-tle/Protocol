package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.StructureBlockUpdatePacket;

@Getter
@Setter
public class StructureBlockUpdatePacketIncremental extends StructureBlockUpdatePacket {
    private int blockPositionIndex;
    private int blockPositionSize;

    private int editorDataIndex;
    private int editorDataSize;

    private int poweredIndex;
    private int poweredSize;

    private int waterloggedIndex;
    private int waterloggedSize;
}

