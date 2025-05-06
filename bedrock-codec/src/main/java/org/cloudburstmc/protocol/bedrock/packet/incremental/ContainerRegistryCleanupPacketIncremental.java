package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ContainerRegistryCleanupPacket;

@Getter
@Setter
public class ContainerRegistryCleanupPacketIncremental extends ContainerRegistryCleanupPacket implements BedrockPacketIncremental {
    private int containersIndex;
    private int containersSize;
}
