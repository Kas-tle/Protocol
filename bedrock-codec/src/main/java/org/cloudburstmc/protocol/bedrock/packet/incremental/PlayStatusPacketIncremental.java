package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayStatusPacket;

@Getter
@Setter
public class PlayStatusPacketIncremental extends PlayStatusPacket {
    private int statusIndex;
    private int statusSize;
}

