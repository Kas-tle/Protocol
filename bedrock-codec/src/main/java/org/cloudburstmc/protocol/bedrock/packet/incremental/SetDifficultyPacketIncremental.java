package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetDifficultyPacket;

@Getter
@Setter
public class SetDifficultyPacketIncremental extends SetDifficultyPacket {
    private int difficultyIndex;
    private int difficultySize;
}

