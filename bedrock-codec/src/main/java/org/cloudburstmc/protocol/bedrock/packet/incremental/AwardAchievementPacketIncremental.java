package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AwardAchievementPacket;

@Getter
@Setter
public class AwardAchievementPacketIncremental extends AwardAchievementPacket implements BedrockPacketIncremental {
    private int achievementIdIndex;
    private int achievementIdSize;
}
