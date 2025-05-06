package org.cloudburstmc.protocol.bedrock.packet.incremental;


import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MotionPredictionHintsPacket;

@Getter
@Setter
public class MotionPredictionHintsPacketIncremental extends MotionPredictionHintsPacket implements BedrockPacketIncremental {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int motionIndex;
    private int motionSize;

    private int onGroundIndex;
    private int onGroundSize;
}

