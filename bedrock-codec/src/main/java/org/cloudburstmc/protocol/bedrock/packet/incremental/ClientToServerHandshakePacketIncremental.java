package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientToServerHandshakePacket;

@Getter
@Setter
public class ClientToServerHandshakePacketIncremental extends ClientToServerHandshakePacket implements BedrockPacketIncremental {
}
