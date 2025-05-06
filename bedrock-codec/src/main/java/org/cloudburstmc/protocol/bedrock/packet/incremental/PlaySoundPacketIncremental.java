package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PlaySoundPacket;

@Getter
@Setter
public class PlaySoundPacketIncremental extends PlaySoundPacket {
    private int soundIndex;
    private int soundSize;

    private int positionIndex;
    private int positionSize;

    private int volumeIndex;
    private int volumeSize;

    private int pitchIndex;
    private int pitchSize;
}

