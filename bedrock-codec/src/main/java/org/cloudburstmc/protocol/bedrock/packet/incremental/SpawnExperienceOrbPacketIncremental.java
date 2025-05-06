package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SpawnExperienceOrbPacket;

@Getter
@Setter
public class SpawnExperienceOrbPacketIncremental extends SpawnExperienceOrbPacket {
    private int positionIndex;
    private int positionSize;

    private int amountIndex;
    private int amountSize;
}

