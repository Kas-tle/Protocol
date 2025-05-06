package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BookEditPacket;

@Getter
@Setter
public class BookEditPacketIncremental extends BookEditPacket implements BedrockPacketIncremental {
    private int actionIndex;
    private int actionSize;

    private int inventorySlotIndex;
    private int inventorySlotSize;

    private int pageNumberIndex;
    private int pageNumberSize;

    private int secondaryPageNumberIndex;
    private int secondaryPageNumberSize;

    private int textIndex;
    private int textSize;

    private int photoNameIndex;
    private int photoNameSize;

    private int titleIndex;
    private int titleSize;

    private int authorIndex;
    private int authorSize;

    private int xuidIndex;
    private int xuidSize;
}

