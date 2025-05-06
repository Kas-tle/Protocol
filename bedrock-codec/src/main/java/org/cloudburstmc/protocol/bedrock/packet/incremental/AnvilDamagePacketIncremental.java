package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AnvilDamagePacket;

@Getter
@Setter
public class AnvilDamagePacketIncremental extends AnvilDamagePacket implements BedrockPacketIncremental {
    private int damageIndex;
    private int damageSize;

    private int positionIndex;
    private int positionSize;
}

