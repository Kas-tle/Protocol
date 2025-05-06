package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ToastRequestPacket;

@Getter
@Setter
public class ToastRequestPacketIncremental extends ToastRequestPacket {
    private int titleIndex;
    private int titleSize;

    private int contentIndex;
    private int contentSize;
}

