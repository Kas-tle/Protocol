package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateTradePacket;

@Getter
@Setter
public class UpdateTradePacketIncremental extends UpdateTradePacket {
    private int containerIdIndex;
    private int containerIdSize;

    private int containerTypeIndex;
    private int containerTypeSize;

    private int sizeIndex;
    private int sizeSize;

    private int tradeTierIndex;
    private int tradeTierSize;

    private int traderUniqueEntityIdIndex;
    private int traderUniqueEntityIdSize;

    private int playerUniqueEntityIdIndex;
    private int playerUniqueEntityIdSize;

    private int displayNameIndex;
    private int displayNameSize;

    private int offersIndex;
    private int offersSize;

    private int newTradingUiIndex;
    private int newTradingUiSize;

    private int recipeAddedOnUpdateIndex;
    private int recipeAddedOnUpdateSize;

    private int usingEconomyTradeIndex;
    private int usingEconomyTradeSize;
}

