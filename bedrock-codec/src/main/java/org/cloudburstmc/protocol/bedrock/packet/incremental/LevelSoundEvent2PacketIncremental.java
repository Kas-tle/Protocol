package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.LevelSoundEvent2Packet;

/**
 * @deprecated since v786
 */
@Deprecated
@Getter
@Setter
public class LevelSoundEvent2PacketIncremental extends LevelSoundEvent2Packet implements BedrockPacketIncremental {
    private int soundIndex;
    private int soundSize;

    private int positionIndex;
    private int positionSize;

    private int extraDataIndex;
    private int extraDataSize;

    private int identifierIndex;
    private int identifierSize;

    private int babySoundIndex;
    private int babySoundSize;

    private int relativeVolumeDisabledIndex;
    private int relativeVolumeDisabledSize;
}

