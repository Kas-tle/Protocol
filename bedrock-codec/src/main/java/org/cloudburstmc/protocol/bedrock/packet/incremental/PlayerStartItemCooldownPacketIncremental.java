package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerStartItemCooldownPacket;

@Getter
@Setter
public class PlayerStartItemCooldownPacketIncremental extends PlayerStartItemCooldownPacket {
    private int itemCategoryIndex;
    private int itemCategorySize;
    
    private int cooldownDurationIndex;
    private int cooldownDurationSize;
    
}

