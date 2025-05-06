package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.GuiDataPickItemPacket;

@Getter
@Setter
public class GuiDataPickItemPacketIncremental extends GuiDataPickItemPacket implements BedrockPacketIncremental {
    private int descriptionIndex;
    private int descriptionSize;

    private int itemEffectsIndex;
    private int itemEffectsSize;

    private int hotbarSlotIndex;
    private int hotbarSlotSize;
}

