package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerInputPacket;

@Getter
@Setter
public class PlayerInputPacketIncremental extends PlayerInputPacket {
    private int inputMotionIndex;
    private int inputMotionSize;

    private int jumpingIndex;
    private int jumpingSize;

    private int sneakingIndex;
    private int sneakingSize;
}

