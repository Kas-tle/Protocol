package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MapInfoRequestPacket;

@Getter
@Setter
public class MapInfoRequestPacketIncremental extends MapInfoRequestPacket implements BedrockPacketIncremental {
    private int uniqueMapIdIndex;
    private int uniqueMapIdSize;

    private int pixelsIndex;
    private int pixelsSize;
}

