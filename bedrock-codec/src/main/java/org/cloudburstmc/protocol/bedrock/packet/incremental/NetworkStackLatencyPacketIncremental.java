package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NetworkStackLatencyPacket;

@Getter
@Setter
public class NetworkStackLatencyPacketIncremental extends NetworkStackLatencyPacket {
    private int timestampIndex;
    private int timestampSize;

    private int fromServerIndex;
    private int fromServerSize;
}

