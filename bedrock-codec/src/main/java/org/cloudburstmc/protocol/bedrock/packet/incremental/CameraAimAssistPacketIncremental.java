package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraAimAssistPacket;

@Getter
@Setter
public class CameraAimAssistPacketIncremental extends CameraAimAssistPacket implements BedrockPacketIncremental {
    private int viewAngleIndex;
    private int viewAngleSize;

    private int distanceIndex;
    private int distanceSize;
    
    private int targetModeIndex;
    private int targetModeSize;

    private int actionIndex;
    private int actionSize;

    private int presetIdIndex;
    private int presetIdSize;
}
