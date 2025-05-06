package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.StructureTemplateDataResponsePacket;

@Getter
@Setter
public class StructureTemplateDataResponsePacketIncremental extends StructureTemplateDataResponsePacket {
    private int nameIndex;
    private int nameSize;

    private int saveIndex;
    private int saveSize;

    private int tagIndex;
    private int tagSize;

    private int typeIndex;
    private int typeSize;
}

