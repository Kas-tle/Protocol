package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AgentActionEventPacket;

/**
 * @since v503
 */
@Getter
@Setter
public class AgentActionEventPacketIncremental extends AgentActionEventPacket implements BedrockPacketIncremental {
    private int requestIdIndex;
    private int requestIdSize;

    private int actionTypeIndex;
    private int actionTypeSize;

    private int responseJsonIndex;
    private int responseJsonSize;
}

