package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.UpdateAdventureSettingsPacket;

@Getter
@Setter
public class UpdateAdventureSettingsPacketIncremental extends UpdateAdventureSettingsPacket {
    private int noPvMIndex;
    private int noPvMSize;

    private int noMvPIndex;
    private int noMvPSize;

    private int immutableWorldIndex;
    private int immutableWorldSize;

    private int showNameTagsIndex;
    private int showNameTagsSize;

    private int autoJumpIndex;
    private int autoJumpSize;
}

