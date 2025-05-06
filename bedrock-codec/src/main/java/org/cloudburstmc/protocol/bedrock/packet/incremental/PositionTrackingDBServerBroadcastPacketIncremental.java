package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PositionTrackingDBServerBroadcastPacket;

@Getter
@Setter
public class PositionTrackingDBServerBroadcastPacketIncremental extends PositionTrackingDBServerBroadcastPacket {
    private int actionIndex;
    private int actionSize;

    private int trackingIdIndex;
    private int trackingIdSize;

    private int tagIndex;
    private int tagSize;
}

