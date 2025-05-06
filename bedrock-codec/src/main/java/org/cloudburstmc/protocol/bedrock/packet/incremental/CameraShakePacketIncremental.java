package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CameraShakePacket;

/**
 * Causes the client's camera view to shake with a specified intensity and duration.
 * <p>
 * No known uses yet.
 */
@Getter
@Setter
public class CameraShakePacketIncremental extends CameraShakePacket implements BedrockPacketIncremental {
    private int intensityIndex;
    private int intensitySize;

    private int durationIndex;
    private int durationSize;

    private int shakeTypeIndex;
    private int shakeTypeSize;

    private int shakeActionIndex;
    private int shakeActionSize;
}

