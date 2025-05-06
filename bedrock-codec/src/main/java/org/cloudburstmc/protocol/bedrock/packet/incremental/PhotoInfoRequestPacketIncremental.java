package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PhotoInfoRequestPacket;

@Getter
@Setter
public class PhotoInfoRequestPacketIncremental extends PhotoInfoRequestPacket {
    private int photoIdIndex;
    private int photoIdSize;
}

