package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetScorePacket;

@Getter
@Setter
public class SetScorePacketIncremental extends SetScorePacket {
    private int actionIndex;
    private int actionSize;

    private int infosIndex;
    private int infosSize;
}

