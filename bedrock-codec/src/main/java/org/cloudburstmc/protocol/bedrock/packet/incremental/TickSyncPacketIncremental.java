package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TickSyncPacket;

/**
 * Used to maintain synchronization with a server running in authoritative mode.
 */
@Getter
@Setter
public class TickSyncPacketIncremental extends TickSyncPacket {
    private int requestTimestampIndex;
    private int requestTimestampSize;

    private int responseTimestampIndex;
    private int responseTimestampSize;
}

