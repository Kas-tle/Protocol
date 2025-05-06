package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TrimDataPacket;

@Getter
@Setter
public class TrimDataPacketIncremental extends TrimDataPacket {
    private int patternsIndex;
    private int patternsSize;

    private int materialsIndex;
    private int materialsSize;
}

