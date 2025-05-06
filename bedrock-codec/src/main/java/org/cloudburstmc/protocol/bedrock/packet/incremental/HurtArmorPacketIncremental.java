package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.HurtArmorPacket;

@Getter
@Setter
public class HurtArmorPacketIncremental extends HurtArmorPacket implements BedrockPacketIncremental {
    private int causeIndex;
    private int causeSize;

    private int damageIndex;
    private int damageSize;

    private int armorSlotsIndex;
    private int armorSlotsSize;
}

