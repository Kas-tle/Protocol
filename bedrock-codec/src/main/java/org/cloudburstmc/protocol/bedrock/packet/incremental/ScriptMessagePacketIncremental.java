package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ScriptMessagePacket;

@Getter
@Setter
public class ScriptMessagePacketIncremental extends ScriptMessagePacket {
    private int channelIndex;
    private int channelSize;

    private int messageIndex;
    private int messageSize;
}

