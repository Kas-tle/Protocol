package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CreatePhotoPacket;

@Getter
@Setter
public class CreatePhotoPacketIncremental extends CreatePhotoPacket implements BedrockPacketIncremental {
    private int idIndex;
    private int idSize;

    private int photoNameIndex;
    private int photoNameSize;

    private int photoItemNameIndex;
    private int photoItemNameSize;
}

