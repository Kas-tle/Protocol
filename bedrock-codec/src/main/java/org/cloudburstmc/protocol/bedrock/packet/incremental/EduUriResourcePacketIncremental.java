package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.EduUriResourcePacket;

@Getter
@Setter
public class EduUriResourcePacketIncremental extends EduUriResourcePacket implements BedrockPacketIncremental {
    private int eduSharedUriResourceIndex;
    private int eduSharedUriResourceSize;
}
