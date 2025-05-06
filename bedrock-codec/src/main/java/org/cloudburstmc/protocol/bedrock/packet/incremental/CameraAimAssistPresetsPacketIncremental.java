package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraAimAssistPresetsPacket;

@Getter
@Setter
public class CameraAimAssistPresetsPacketIncremental extends CameraAimAssistPresetsPacket implements BedrockPacketIncremental {
    private int categoriesIndex;
    private int categoriesSize;

    private int presetsIndex;
    private int presetsSize;

    private int operationIndex;
    private int operationSize;
}