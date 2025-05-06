package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.GameTestRequestPacket;

@Getter
@Setter
public class GameTestRequestPacketIncremental extends GameTestRequestPacket implements BedrockPacketIncremental {
    private int maxTestsPerBatchIndex;
    private int maxTestsPerBatchSize;

    private int repeatCountIndex;
    private int repeatCountSize;

    private int rotationIndex;
    private int rotationSize;

    private int stoppingOnFailureIndex;
    private int stoppingOnFailureSize;

    private int testPosIndex;
    private int testPosSize;

    private int testsPerRowIndex;
    private int testsPerRowSize;

    private int testNameIndex;
    private int testNameSize;
}
