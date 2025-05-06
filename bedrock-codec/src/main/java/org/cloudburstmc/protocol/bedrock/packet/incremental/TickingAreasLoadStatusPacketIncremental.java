package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TickingAreasLoadStatusPacket;

/**
 * Client bound packet to indicate whether the server has preloaded the ticking areas.
 *
 * @since v503
 */
@Getter
@Setter
public class TickingAreasLoadStatusPacketIncremental extends TickingAreasLoadStatusPacket {
    private int waitingForPreloadIndex;
    private int waitingForPreloadSize;
}

