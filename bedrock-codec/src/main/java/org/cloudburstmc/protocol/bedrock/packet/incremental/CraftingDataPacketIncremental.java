package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CraftingDataPacket;

@Getter
@Setter
public class CraftingDataPacketIncremental extends CraftingDataPacket implements BedrockPacketIncremental {
    private int craftingDataIndex;
    private int craftingDataSize;

    private int potionMixDataIndex;
    private int potionMixDataSize;

    private int containerMixDataIndex;
    private int containerMixDataSize;

    private int materialReducersIndex;
    private int materialReducersSize;

    private int cleanRecipesIndex;
    private int cleanRecipesSize;
}

