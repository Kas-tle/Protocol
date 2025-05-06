package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.StopSoundPacket;

@Getter
@Setter
public class StopSoundPacketIncremental extends StopSoundPacket {
    private int soundNameIndex;
    private int soundNameSize;

    private int stoppingAllSoundIndex;
    private int stoppingAllSoundSize;
    
    private int stopMusicLegacyIndex;
    private int stopMusicLegacySize;
}

