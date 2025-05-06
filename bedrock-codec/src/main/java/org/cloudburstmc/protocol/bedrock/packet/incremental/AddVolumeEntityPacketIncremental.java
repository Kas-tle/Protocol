package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AddVolumeEntityPacket;

@Getter
@Setter
public class AddVolumeEntityPacketIncremental extends AddVolumeEntityPacket implements BedrockPacketIncremental {
    private int idIndex;
    private int idSize;

    private int dataIndex;
    private int dataSize;

    private int engineVersionIndex;
    private int engineVersionSize;

    private int identifierIndex;
    private int identifierSize;

    private int instanceNameIndex;
    private int instanceNameSize;

    private int minBoundsIndex;
    private int minBoundsSize;

    private int maxBoundsIndex;
    private int maxBoundsSize;

    private int dimensionIndex;
    private int dimensionSize;
}

