package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.DeathInfoPacket;

@Getter
@Setter
public class DeathInfoPacketIncremental extends DeathInfoPacket implements BedrockPacketIncremental {
    private int causeAttackNameIndex;
    private int causeAttackNameSize;

    private int messageListIndex;
    private int messageListSize;
}

