package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraPresetsPacket;

@Getter
@Setter
public class CameraPresetsPacketIncremental extends CameraPresetsPacket implements BedrockPacketIncremental {
    private int presetsIndex;
    private int presetsSize;
}

