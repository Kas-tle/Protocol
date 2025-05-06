package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.FeatureRegistryPacket;

/**
 * World generation features used for client-side chunk generation.
 *
 * @since 1.19.20
 */
@Getter
@Setter
public class FeatureRegistryPacketIncremental extends FeatureRegistryPacket implements BedrockPacketIncremental {
    private int featuresIndex;
    private int featuresSize;
}

