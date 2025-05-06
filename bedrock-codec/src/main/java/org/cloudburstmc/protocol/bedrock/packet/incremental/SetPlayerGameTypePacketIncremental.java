package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetPlayerGameTypePacket;

@Getter
@Setter
public class SetPlayerGameTypePacketIncremental extends SetPlayerGameTypePacket {
    private int gamemodeIndex;
    private int gamemodeSize;
}

