package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SpawnParticleEffectPacket;

@Getter
@Setter
public class SpawnParticleEffectPacketIncremental extends SpawnParticleEffectPacket {
    private int dimensionIdIndex;
    private int dimensionIdSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int positionIndex;
    private int positionSize;

    private int identifierIndex;
    private int identifierSize;

    private int molangVariablesJsonIndex;
    private int molangVariablesJsonSize;
}

