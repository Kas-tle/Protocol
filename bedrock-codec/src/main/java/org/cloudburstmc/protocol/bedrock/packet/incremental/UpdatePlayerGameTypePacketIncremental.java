package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdatePlayerGameTypePacket;

@Getter
@Setter
public class UpdatePlayerGameTypePacketIncremental extends UpdatePlayerGameTypePacket {
    private int gameTypeIndex;
    private int gameTypeSize;

    private int entityIdIndex;
    private int entityIdSize;

    private int tickIndex;
    private int tickSize;
}

