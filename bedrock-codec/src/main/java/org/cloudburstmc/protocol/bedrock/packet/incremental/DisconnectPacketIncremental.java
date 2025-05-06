package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.DisconnectPacket;

@Getter
@Setter
public class DisconnectPacketIncremental extends DisconnectPacket implements BedrockPacketIncremental {
    private int reasonIndex;
    private int reasonSize;

    private int messageSkippedIndex;
    private int messageSkippedSize;

    private int kickMessageIndex;
    private int kickMessageSize;

    private int filteredMessageIndex;
    private int filteredMessageSize;
}

