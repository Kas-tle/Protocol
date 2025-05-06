package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AvailableEntityIdentifiersPacket;

@Getter
@Setter
public class AvailableEntityIdentifiersPacketIncremental extends AvailableEntityIdentifiersPacket implements BedrockPacketIncremental {
    private int identifiersIndex;
    private int identifiersSize;
}

