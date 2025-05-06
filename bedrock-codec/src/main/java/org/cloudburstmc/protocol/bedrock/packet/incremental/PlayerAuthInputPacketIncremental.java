package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerAuthInputPacket;

@Getter
@Setter
public class PlayerAuthInputPacketIncremental extends PlayerAuthInputPacket {
    private int rotationIndex;
    private int rotationSize;

    private int positionIndex;
    private int positionSize;

    private int motionIndex;
    private int motionSize;

    private int inputDataIndex;
    private int inputDataSize;

    private int inputModeIndex;
    private int inputModeSize;

    private int playModeIndex;
    private int playModeSize;

    private int vrGazeDirectionIndex;
    private int vrGazeDirectionSize;

    private int tickIndex;
    private int tickSize;

    private int deltaIndex;
    private int deltaSize;

    private int itemUseTransactionIndex;
    private int itemUseTransactionSize;

    private int itemStackRequestIndex;
    private int itemStackRequestSize;

    private int playerActionsIndex;
    private int playerActionsSize;

    private int inputInteractionModelIndex;
    private int inputInteractionModelSize;

    private int interactRotationIndex;
    private int interactRotationSize;

    private int analogMoveVectorIndex;
    private int analogMoveVectorSize;

    private int predictedVehicleIndex;
    private int predictedVehicleSize;

    private int vehicleRotationIndex;
    private int vehicleRotationSize;

    private int cameraOrientationIndex;
    private int cameraOrientationSize;
    
    private int rawMoveVectorIndex;
    private int rawMoveVectorSize;
}

