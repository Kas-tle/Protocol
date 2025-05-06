package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ItemFrameDropItemPacket;

/**
 * Deprecated since v662
 */
@Deprecated
@Getter
@Setter
public class ItemFrameDropItemPacketIncremental extends ItemFrameDropItemPacket implements BedrockPacketIncremental {
    private int blockPositionIndex;
    private int blockPositionSize;
}

