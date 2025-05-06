package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ShowCreditsPacket;

@Getter
@Setter
public class ShowCreditsPacketIncremental extends ShowCreditsPacket {
    private int runtimeEntityIdIndex;
    private int runtimeEntityIdSize;

    private int statusIndex;
    private int statusSize;
}

