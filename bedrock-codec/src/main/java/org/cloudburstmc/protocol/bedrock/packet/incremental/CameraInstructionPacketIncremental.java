package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraInstructionPacket;

@Getter
@Setter
public class CameraInstructionPacketIncremental extends CameraInstructionPacket implements BedrockPacketIncremental {
    private int setInstructionIndex;
    private int setInstructionSize;

    private int fadeInstructionIndex;
    private int fadeInstructionSize;

    private int clearIndex;
    private int clearSize;

    private int targetInstructionIndex;
    private int targetInstructionSize;

    private int removeTargetIndex;
    private int removeTargetSize;
}

