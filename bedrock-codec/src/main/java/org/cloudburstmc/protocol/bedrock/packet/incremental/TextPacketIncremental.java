package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TextPacket;

@Getter
@Setter
public class TextPacketIncremental extends TextPacket {
    private int typeIndex;
    private int typeSize;

    private int needsTranslationIndex;
    private int needsTranslationSize;

    private int sourceNameIndex;
    private int sourceNameSize;

    private int messageIndex;
    private int messageSize;

    private int parametersIndex;
    private int parametersSize;

    private int xuidIndex;
    private int xuidSize;

    private int platformChatIdIndex;
    private int platformChatIdSize;

    private int filteredMessageIndex;
    private int filteredMessageSize;
}

