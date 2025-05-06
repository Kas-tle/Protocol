package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MovePlayerPacket;

@Getter
@Setter
public class MovePlayerPacketIncremental extends MovePlayerPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int positionIndex;
    private int positionSize;

    private int rotationIndex;
    private int rotationSize;

    private int modeIndex;
    private int modeSize;

    private int onGroundIndex;
    private int onGroundSize;

    private int ridingRuntimeEntityIdIndex;
    private int ridingRuntimeEntityIdSize;

    private int teleportationCauseIndex;
    private int teleportationCauseSize;
    
    private int entityTypeIndex;
    private int entityTypeSize;

    private int tickIndex;
    private int tickSize;
}

