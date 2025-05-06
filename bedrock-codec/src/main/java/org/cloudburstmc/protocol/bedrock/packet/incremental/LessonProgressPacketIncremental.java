package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LessonProgressPacket;

@Getter
@Setter
public class LessonProgressPacketIncremental extends LessonProgressPacket implements BedrockPacketIncremental {
    private int actionIndex;
    private int actionSize;

    private int scoreIndex;
    private int scoreSize;

    private int activityIdIndex;
    private int activityIdSize;
}

