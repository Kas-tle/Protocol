package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlayerFogPacket;

/**
 * Tracks the current fog effects applied to a client
 */
@Getter
@Setter
public class PlayerFogPacketIncremental extends PlayerFogPacket {
    private int fogStackIndex;
    private int fogStackSize;
}

