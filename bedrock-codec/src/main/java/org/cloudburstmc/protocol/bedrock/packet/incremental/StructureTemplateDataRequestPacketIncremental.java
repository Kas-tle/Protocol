package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.StructureTemplateDataRequestPacket;

@Getter
@Setter
public class StructureTemplateDataRequestPacketIncremental extends StructureTemplateDataRequestPacket {
    private int nameIndex;
    private int nameSize;

    private int positionIndex;
    private int positionSize;

    private int settingsIndex;
    private int settingsSize;

    private int operationIndex;
    private int operationSize;
}

