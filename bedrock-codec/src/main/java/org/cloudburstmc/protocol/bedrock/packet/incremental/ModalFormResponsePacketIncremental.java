package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ModalFormResponsePacket;

@Getter
@Setter
public class ModalFormResponsePacketIncremental extends ModalFormResponsePacket implements BedrockPacketIncremental {
    private int formIdIndex;
    private int formIdSize;

    private int formDataIndex;
    private int formDataSize;

    private int cancelReasonIndex;
    private int cancelReasonSize;
}

