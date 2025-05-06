package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.MultiplayerSettingsPacket;

@Getter
@Setter
public class MultiplayerSettingsPacketIncremental extends MultiplayerSettingsPacket {
    private int modeIndex;
    private int modeSize;
}

