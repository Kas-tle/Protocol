package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CraftingEventPacket;

/**
 * @since since v630
 */
@Deprecated
@Getter
@Setter
public class CraftingEventPacketIncremental extends CraftingEventPacket implements BedrockPacketIncremental {
    private int inputsIndex;
    private int inputsSize;

    private int outputsIndex;
    private int outputsSize;

    private int containerIdIndex;
    private int containerIdSize;

    private int typeIndex;
    private int typeSize;

    private int uuidIndex;
    private int uuidSize;
}

