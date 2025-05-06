package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SettingsCommandPacket;

@Getter
@Setter
public class SettingsCommandPacketIncremental extends SettingsCommandPacket {
    private int commandIndex;
    private int commandSize;

    private int suppressingOutputIndex;
    private int suppressingOutputSize;
}

