package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ServerStatsPacket;

/**
 * Stats sent to the client regarding the server's network performance
 * that are used for telemetry.
 */
@Getter
@Setter
public class ServerStatsPacketIncremental extends ServerStatsPacket {
    private int serverTimeIndex;
    private int serverTimeSize;

    private int networkTimeIndex;
    private int networkTimeSize;
}
