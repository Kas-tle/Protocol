package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetHudPacket;

/**
 * @since v649
 */
@Getter
@Setter
public class SetHudPacketIncremental extends SetHudPacket {
    private int elementsIndex;
    private int elementsSize;

    private int visibilityIndex;
    private int visibilitySize;
}

