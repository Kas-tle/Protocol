package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MobEquipmentPacket;

@Getter
@Setter
public class MobEquipmentPacketIncremental extends MobEquipmentPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int itemIndex;
    private int itemSize;

    private int inventorySlotIndex;
    private int inventorySlotSize;

    private int hotbarSlotIndex;
    private int hotbarSlotSize;

    private int containerIdIndex;
    private int containerIdSize;
}

