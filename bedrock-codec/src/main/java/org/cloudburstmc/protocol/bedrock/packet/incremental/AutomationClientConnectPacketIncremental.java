package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AutomationClientConnectPacket;

@Getter
@Setter
public class AutomationClientConnectPacketIncremental extends AutomationClientConnectPacket implements BedrockPacketIncremental {
    private int addressIndex;
    private int addressSize;
}

