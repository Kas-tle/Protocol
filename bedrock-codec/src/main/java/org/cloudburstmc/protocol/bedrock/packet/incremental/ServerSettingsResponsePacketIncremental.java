package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ServerSettingsResponsePacket;

@Getter
@Setter
public class ServerSettingsResponsePacketIncremental extends ServerSettingsResponsePacket {
    private int formIdIndex;
    private int formIdSize;

    private int formDataIndex;
    private int formDataSize;
}

