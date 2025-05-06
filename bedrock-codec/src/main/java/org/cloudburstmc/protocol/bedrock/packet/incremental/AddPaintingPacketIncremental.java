package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddPaintingPacket;

@Getter
@Setter
public class AddPaintingPacketIncremental extends AddPaintingPacket implements BedrockPacketIncremental {
    private int motiveIndex;
    private int motiveSize;
}
