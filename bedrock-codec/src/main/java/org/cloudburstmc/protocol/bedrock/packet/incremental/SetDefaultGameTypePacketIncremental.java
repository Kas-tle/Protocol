package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetDefaultGameTypePacket;

@Getter
@Setter
public class SetDefaultGameTypePacketIncremental extends SetDefaultGameTypePacket {
    private int gamemodeIndex;
    private int gamemodeSize;
}

