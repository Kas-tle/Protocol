package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ModalFormRequestPacket;

@Getter
@Setter
public class ModalFormRequestPacketIncremental extends ModalFormRequestPacket implements BedrockPacketIncremental {
    private int formIdIndex;
    private int formIdSize;

    private int formDataIndex;
    private int formDataSize;
}

