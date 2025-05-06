package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CodeBuilderPacket;

@Getter
@Setter
public class CodeBuilderPacketIncremental extends CodeBuilderPacket implements BedrockPacketIncremental {
    private int urlIndex;
    private int urlSize;

    private int openingIndex;
    private int openingSize;
}
