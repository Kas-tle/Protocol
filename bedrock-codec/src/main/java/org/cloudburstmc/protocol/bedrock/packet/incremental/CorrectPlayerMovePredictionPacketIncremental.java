package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CorrectPlayerMovePredictionPacket;

/**
 * Sent to the client when the server's movement prediction system does not match what the client is sending.
 */
@Getter
@Setter
public class CorrectPlayerMovePredictionPacketIncremental extends CorrectPlayerMovePredictionPacket implements BedrockPacketIncremental {
    private int positionIndex;
    private int positionSize;

    private int deltaIndex;
    private int deltaSize;

    private int onGroundIndex;
    private int onGroundSize;

    private int tickIndex;
    private int tickSize;

    private int predictionTypeIndex;
    private int predictionTypeSize;

    private int vehicleRotationIndex;
    private int vehicleRotationSize;

    private int vehicleAngularVelocityIndex;
    private int vehicleAngularVelocitySize;
}

