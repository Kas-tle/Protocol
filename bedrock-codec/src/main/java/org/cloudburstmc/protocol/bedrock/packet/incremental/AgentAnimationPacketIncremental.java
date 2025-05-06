package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AgentAnimationPacket;

@Getter
@Setter
public class AgentAnimationPacketIncremental extends AgentAnimationPacket implements BedrockPacketIncremental {
    private int animationIndex;
    private int animationSize;

    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;
}

