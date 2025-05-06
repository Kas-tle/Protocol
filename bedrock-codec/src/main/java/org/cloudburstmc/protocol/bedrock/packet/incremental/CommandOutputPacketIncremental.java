package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.CommandOutputPacket;


@Getter
@Setter
public class CommandOutputPacketIncremental extends CommandOutputPacket implements BedrockPacketIncremental {
    private int messagesIndex;
    private int messagesSize;

    private int commandOriginDataIndex;
    private int commandOriginDataSize;

    private int typeIndex;
    private int typeSize;

    private int successCountIndex;
    private int successCountSize;

    private int dataIndex;
    private int dataSize;
}

