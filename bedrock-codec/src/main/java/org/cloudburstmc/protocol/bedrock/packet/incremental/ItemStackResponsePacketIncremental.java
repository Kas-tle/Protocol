package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ItemStackResponsePacket;

/**
 * ItemStackResponse is sent by the server in response to an ItemStackRequest packet from the client. This
 * packet is used to either approve or reject ItemStackRequests from the client. If a request is approved, the
 * client will simply continue as normal. If rejected, the client will undo the actions so that the inventory
 * should be in sync with the server again.
 */
@Getter
@Setter
public class ItemStackResponsePacketIncremental extends ItemStackResponsePacket implements BedrockPacketIncremental {
    private int entriesIndex;
    private int entriesSize;
}

