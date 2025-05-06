package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerArmorDamagePacket;

@Getter
@Setter
public class PlayerArmorDamagePacketIncremental extends PlayerArmorDamagePacket {
    private int flagsIndex;
    private int flagsSize;

    private int damageIndex;
    private int damageSize;
}

