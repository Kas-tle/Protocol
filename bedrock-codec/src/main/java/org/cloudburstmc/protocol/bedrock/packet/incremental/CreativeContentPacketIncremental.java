package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CreativeContentPacket;


/**
 * CreativeContent is a packet sent by the server to set the creative inventory's content for a player.
 * Introduced in 1.16, this packet replaces the previous method - sending an InventoryContent packet with
 * creative inventory window ID.
 */
@Getter
@Setter
public class CreativeContentPacketIncremental extends CreativeContentPacket implements BedrockPacketIncremental {
    private int groupsIndex;
    private int groupsSize;

    private int contentsIndex;
    private int contentsSize;
}

