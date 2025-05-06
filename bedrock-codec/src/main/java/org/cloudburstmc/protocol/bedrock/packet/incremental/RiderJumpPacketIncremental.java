package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RiderJumpPacket;

@Getter
@Setter
public class RiderJumpPacketIncremental extends RiderJumpPacket {
    private int jumpStrengthIndex;
    private int jumpStrengthSize;
}

