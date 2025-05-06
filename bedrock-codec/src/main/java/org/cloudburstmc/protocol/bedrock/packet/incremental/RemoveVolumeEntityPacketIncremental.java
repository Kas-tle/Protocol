package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RemoveVolumeEntityPacket;

@Getter
@Setter
public class RemoveVolumeEntityPacketIncremental extends RemoveVolumeEntityPacket {
    private int idIndex;
    private int idSize;

    private int dimensionIndex;
    private int dimensionSize;
}

