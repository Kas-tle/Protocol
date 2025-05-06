package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EmotePacket;

@Getter
@Setter
public class EmotePacketIncremental extends EmotePacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int xuidIndex;
    private int xuidSize;

    private int platformIdIndex;
    private int platformIdSize;

    private int emoteIdIndex;
    private int emoteIdSize;

    private int flagsIndex;
    private int flagsSize;

    private int emoteDurationIndex;
    private int emoteDurationSize;
}

