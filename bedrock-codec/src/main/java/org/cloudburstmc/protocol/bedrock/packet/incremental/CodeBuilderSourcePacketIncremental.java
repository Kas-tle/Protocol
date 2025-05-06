package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CodeBuilderSourcePacket;

@Getter
@Setter
public class CodeBuilderSourcePacketIncremental extends CodeBuilderSourcePacket implements BedrockPacketIncremental {
    private int operationIndex;
    private int operationSize;

    private int categoryIndex;
    private int categorySize;

    private int valueIndex;
    private int valueSize;

    private int codeStatusIndex;
    private int codeStatusSize;
}

