package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraAimAssistInstructionPacket;

@Getter
@Setter
public class CameraAimAssistInstructionPacketIncremental extends CameraAimAssistInstructionPacket implements BedrockPacketIncremental {
    private int presetIdIndex;
    private int presetIdSize;

    private int actionIndex;
    private int actionSize;

    private int allowAimAssistIndex;
    private int allowAimAssistSize;
}
