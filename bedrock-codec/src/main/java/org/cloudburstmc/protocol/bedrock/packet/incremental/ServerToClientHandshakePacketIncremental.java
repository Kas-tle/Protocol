package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ServerToClientHandshakePacket;


@Getter
@Setter
public class ServerToClientHandshakePacketIncremental extends ServerToClientHandshakePacket {
    private int jwtIndex;
    private int jwtSize;
}

