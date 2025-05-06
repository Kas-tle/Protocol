package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateEquipPacket;

@Getter
@Setter
public class UpdateEquipPacketIncremental extends UpdateEquipPacket {
    private int windowIdIndex;
    private int windowIdSize;

    private int windowTypeIndex;
    private int windowTypeSize;

    private int sizeIndex;
    private int sizeSize;

    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int tagIndex;
    private int tagSize;
}

