package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerEnchantOptionsPacket;

@Getter
@Setter
public class PlayerEnchantOptionsPacketIncremental extends PlayerEnchantOptionsPacket {
    private int optionsIndex;
    private int optionsSize;
}

