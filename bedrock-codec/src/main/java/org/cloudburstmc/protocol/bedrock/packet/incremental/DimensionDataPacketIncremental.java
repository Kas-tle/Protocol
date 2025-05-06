package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.DimensionDataPacket;
import org.cloudburstmc.protocol.bedrock.packet.StartGamePacket;

/**
 * Sends a list of the data-driven dimensions to the client.
 * This packet is sent before the {@link StartGamePacket} in the login sequence.
 *
 * <b>Note:</b> The client only supports sending the <code>minecraft:overworld</code> dimension as of 1.18.30
 *
 * @since v503
 */
@Getter
@Setter
public class DimensionDataPacketIncremental extends DimensionDataPacket implements BedrockPacketIncremental {
    private int definitionsIndex;
    private int definitionsSize;
}

