package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.InventoryContentPacket;

@Getter
@Setter
public class InventoryContentPacketIncremental extends InventoryContentPacket implements BedrockPacketIncremental {
    private int contentsIndex;
    private int contentsSize;

    private int containerIdIndex;
    private int containerIdSize;

    private int containerNameDataIndex;
    private int containerNameDataSize;

    private int dynamicContainerSizeIndex;
    private int dynamicContainerSizeSize;

    private int storageItemIndex;
    private int storageItemSize;
}

