package org.cloudburstmc.protocol.bedrock.packet.incremental;


import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ItemComponentPacket;

/**
 * Definitions for custom component items added to the game
 */
@Getter
@Setter
public class ItemComponentPacketIncremental extends ItemComponentPacket implements BedrockPacketIncremental {
    private int itemsIndex;
    private int itemsSize;
}

