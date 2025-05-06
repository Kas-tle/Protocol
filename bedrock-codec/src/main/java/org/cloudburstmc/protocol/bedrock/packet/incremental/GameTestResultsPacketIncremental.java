package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.GameTestResultsPacket;

@Getter
@Setter
public class GameTestResultsPacketIncremental extends GameTestResultsPacket implements BedrockPacketIncremental {
    private int successfulIndex;
    private int successfulSize;

    private int errorIndex;
    private int errorSize;

    private int testNameIndex;
    private int testNameSize;
}
