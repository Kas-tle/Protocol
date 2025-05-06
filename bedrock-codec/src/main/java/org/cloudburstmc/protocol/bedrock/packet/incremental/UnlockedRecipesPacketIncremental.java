package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UnlockedRecipesPacket;

@Getter
@Setter
public class UnlockedRecipesPacketIncremental extends UnlockedRecipesPacket {
    private int actionIndex;
    private int actionSize;

    private int unlockedRecipesIndex;
    private int unlockedRecipesSize;
}

