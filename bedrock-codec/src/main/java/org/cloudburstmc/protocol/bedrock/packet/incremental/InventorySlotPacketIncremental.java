package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.InventorySlotPacket;

@Getter
@Setter
public class InventorySlotPacketIncremental extends InventorySlotPacket implements BedrockPacketIncremental {
    private int containerIdIndex;
    private int containerIdSize;

    private int slotIndex;
    private int slotSize;

    private int itemIndex;
    private int itemSize;

    private int containerNameDataIndex;
    private int containerNameDataSize;

    private int dynamicContainerSizeIndex;
    private int dynamicContainerSizeSize;

    private int storageItemIndex;
    private int storageItemSize;
}

