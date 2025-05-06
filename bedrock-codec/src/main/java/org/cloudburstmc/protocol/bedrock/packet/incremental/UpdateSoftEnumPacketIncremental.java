package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateSoftEnumPacket;

@Getter
@Setter
public class UpdateSoftEnumPacketIncremental extends UpdateSoftEnumPacket {
    private int softEnumIndex;
    private int softEnumSize;

    private int typeIndex;
    private int typeSize;
}

