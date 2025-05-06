package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.TransferPacket;

@Getter
@Setter
public class TransferPacketIncremental extends TransferPacket {
    private int addressIndex;
    private int addressSize;

    private int portIndex;
    private int portSize;

    private int reloadWorldIndex;
    private int reloadWorldSize;
}

