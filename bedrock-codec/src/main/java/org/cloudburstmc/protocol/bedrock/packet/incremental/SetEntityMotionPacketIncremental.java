package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetEntityMotionPacket;

@Getter
@Setter
public class SetEntityMotionPacketIncremental extends SetEntityMotionPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int motionIndex;
    private int motionSize;

    private int tickIndex;
    private int tickSize;
}

