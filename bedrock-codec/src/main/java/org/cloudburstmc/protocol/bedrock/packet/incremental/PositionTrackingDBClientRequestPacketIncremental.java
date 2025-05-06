package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PositionTrackingDBClientRequestPacket;

@Getter
@Setter
public class PositionTrackingDBClientRequestPacketIncremental extends PositionTrackingDBClientRequestPacket {
    private int actionIndex;
    private int actionSize;

    private int trackingIdIndex;
    private int trackingIdSize;
}

