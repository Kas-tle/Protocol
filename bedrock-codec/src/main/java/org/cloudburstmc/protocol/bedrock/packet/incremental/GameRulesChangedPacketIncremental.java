package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.GameRulesChangedPacket;

@Getter
@Setter
public class GameRulesChangedPacketIncremental extends GameRulesChangedPacket implements BedrockPacketIncremental {
    private int gameRulesIndex;
    private int gameRulesSize;
}

