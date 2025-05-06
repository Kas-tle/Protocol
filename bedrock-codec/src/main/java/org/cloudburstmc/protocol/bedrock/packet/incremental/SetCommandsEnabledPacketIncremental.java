package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.SetCommandsEnabledPacket;

@Getter
@Setter
public class SetCommandsEnabledPacketIncremental extends SetCommandsEnabledPacket {
    private int commandsEnabledIndex;
    private int commandsEnabledSize;
}

