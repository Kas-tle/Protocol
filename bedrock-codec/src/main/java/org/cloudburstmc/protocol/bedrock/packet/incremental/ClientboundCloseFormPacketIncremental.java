package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ClientboundCloseFormPacket;

@Getter
@Setter
public class ClientboundCloseFormPacketIncremental extends ClientboundCloseFormPacket implements BedrockPacketIncremental {
}
