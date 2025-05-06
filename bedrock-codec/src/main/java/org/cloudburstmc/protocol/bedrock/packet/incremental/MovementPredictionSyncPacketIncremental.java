package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MovementPredictionSyncPacket;

@Getter
@Setter
public class MovementPredictionSyncPacketIncremental extends MovementPredictionSyncPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int flagsIndex;
    private int flagsSize;

    private int boundingBoxIndex;
    private int boundingBoxSize;

    private int speedIndex;
    private int speedSize;

    private int underwaterSpeedIndex;
    private int underwaterSpeedSize;

    private int lavaSpeedIndex;
    private int lavaSpeedSize;

    private int jumpStrengthIndex;
    private int jumpStrengthSize;

    private int healthIndex;
    private int healthSize;

    private int hungerIndex;
    private int hungerSize;

    private int flyingIndex;
    private int flyingSize;
}

