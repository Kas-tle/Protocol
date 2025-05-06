package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AvailableCommandsPacket;

@Getter
@Setter
public class AvailableCommandsPacketIncremental extends AvailableCommandsPacket implements BedrockPacketIncremental {
    private int commandsIndex;
    private int commandsSize;
}

