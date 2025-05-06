package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraPacket;

@Getter
@Setter
public class CameraPacketIncremental extends CameraPacket implements BedrockPacketIncremental {
    private long cameraUniqueEntityIdIndex;
    private long cameraUniqueEntityIdSize;

    private long playerUniqueEntityIdIndex;
    private long playerUniqueEntityIdSize;
}

