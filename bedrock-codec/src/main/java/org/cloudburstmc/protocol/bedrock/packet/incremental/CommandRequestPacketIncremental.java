package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CommandRequestPacket;

@Getter
@Setter
public class CommandRequestPacketIncremental extends CommandRequestPacket implements BedrockPacketIncremental {
    private int commandIndex;
    private int commandSize;

    private int commandOriginDataIndex;
    private int commandOriginDataSize;

    private int internalIndex;
    private int internalSize;

    private int versionIndex;
    private int versionSize;
}

