package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LoginPacket;

@Getter
@Setter
public class LoginPacketIncremental extends LoginPacket implements BedrockPacketIncremental {
    private int protocolVersionIndex;
    private int protocolVersionSize;

    private int chainIndex;
    private int chainSize;

    private int extraIndex;
    private int extraSize;
}

