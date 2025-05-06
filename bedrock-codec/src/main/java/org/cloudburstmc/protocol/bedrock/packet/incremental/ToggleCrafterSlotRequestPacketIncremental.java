package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ToggleCrafterSlotRequestPacket;

@Getter
@Setter
public class ToggleCrafterSlotRequestPacketIncremental extends ToggleCrafterSlotRequestPacket {
    private int blockPositionIndex;
    private int blockPositionSize;

    private int slotIndex;
    private int slotSize;

    private int disabledIndex;
    private int disabledSize;
}

