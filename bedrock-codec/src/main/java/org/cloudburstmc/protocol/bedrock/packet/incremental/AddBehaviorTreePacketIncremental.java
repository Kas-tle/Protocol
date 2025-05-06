package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddBehaviorTreePacket;

@Getter
@Setter
public class AddBehaviorTreePacketIncremental extends AddBehaviorTreePacket implements BedrockPacketIncremental {
    private int behaviorTreeJsonIndex;
    private int behaviorTreeJsonSize;
}

