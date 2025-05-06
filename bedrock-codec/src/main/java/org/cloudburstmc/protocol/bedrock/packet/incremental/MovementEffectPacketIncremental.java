package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MovementEffectPacket;

@Getter
@Setter
public class MovementEffectPacketIncremental extends MovementEffectPacket {
    private int entityRuntimeIdIndex;
    private int entityRuntimeIdSize;

    private int effectTypeIndex;
    private int effectTypeSize;

    private int durationIndex;
    private int durationSize;

    private int tickIndex;
    private int tickSize;
}