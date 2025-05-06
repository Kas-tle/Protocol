package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetPlayerInventoryOptionsPacket;

@Getter
@Setter
public class SetPlayerInventoryOptionsPacketIncremental extends SetPlayerInventoryOptionsPacket {
    private int leftTabIndex;
    private int leftTabSize;

    private int rightTabIndex;
    private int rightTabSize;

    private int filteringIndex;
    private int filteringSize;

    private int layoutIndex;
    private int layoutSize;

    private int craftingLayoutIndex;
    private int craftingLayoutSize;
}

