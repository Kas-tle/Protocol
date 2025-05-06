package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerHotbarPacket;

@Getter
@Setter
public class PlayerHotbarPacketIncremental extends PlayerHotbarPacket {
    private int selectedHotbarSlotIndex;
    private int selectedHotbarSlotSize;

    private int containerIdIndex;
    private int containerIdSize;

    private int selectHotbarSlotIndex;
    private int selectHotbarSlotSize;
}

