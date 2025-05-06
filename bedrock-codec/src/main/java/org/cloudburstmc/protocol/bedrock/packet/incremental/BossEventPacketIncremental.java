package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BossEventPacket;

@Getter
@Setter
public class BossEventPacketIncremental extends BossEventPacket implements BedrockPacketIncremental {
    private long bossUniqueEntityIdIndex;
    private long bossUniqueEntityIdSize;

    private int actionIndex;
    private int actionSize;

    private long playerUniqueEntityIdIndex;
    private long playerUniqueEntityIdSize;

    private int titleIndex;
    private int titleSize;

    private int filteredTitleIndex;
    private int filteredTitleSize;

    private int healthPercentageIndex;
    private int healthPercentageSize;

    private int darkenSkyIndex;
    private int darkenSkySize;

    private int colorIndex;
    private int colorSize;

    private int overlayIndex;
    private int overlaySize;
}

