package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MobEffectPacket;

@Getter
@Setter
public class MobEffectPacketIncremental extends MobEffectPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int eventIndex;
    private int eventSize;

    private int effectIdIndex;
    private int effectIdSize;

    private int amplifierIndex;
    private int amplifierSize;

    private int particlesIndex;
    private int particlesSize;

    private int durationIndex;
    private int durationSize;

    private int tickIndex;
    private int tickSize;
}

