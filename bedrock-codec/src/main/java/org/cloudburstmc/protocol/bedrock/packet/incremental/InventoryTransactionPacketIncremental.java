package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.InventoryTransactionPacket;

@Getter
@Setter
public class InventoryTransactionPacketIncremental extends InventoryTransactionPacket implements BedrockPacketIncremental {
    private int legacyRequestIdIndex;
    private int legacyRequestIdSize;

    private int legacySlotsIndex;
    private int legacySlotsSize;

    private int actionsIndex;
    private int actionsSize;

    private int transactionTypeIndex;
    private int transactionTypeSize;

    private int actionTypeIndex;
    private int actionTypeSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int blockPositionIndex;
    private int blockPositionSize;

    private int blockFaceIndex;
    private int blockFaceSize;

    private int hotbarSlotIndex;
    private int hotbarSlotSize;

    private int itemInHandIndex;
    private int itemInHandSize;

    private int playerPositionIndex;
    private int playerPositionSize;

    private int clickPositionIndex;
    private int clickPositionSize;

    private int headPositionIndex;
    private int headPositionSize;


    private int usingNetIdsIndex;
    private int usingNetIdsSize;


    private int blockDefinitionIndex;
    private int blockDefinitionSize;

    private int triggerTypeIndex;
    private int triggerTypeSize;

    private int clientInteractPredictionIndex;
    private int clientInteractPredictionSize;
}

