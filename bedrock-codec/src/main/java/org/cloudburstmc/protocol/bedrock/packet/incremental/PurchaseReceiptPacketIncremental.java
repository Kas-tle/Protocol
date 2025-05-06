package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PurchaseReceiptPacket;

@Getter
@Setter
public class PurchaseReceiptPacketIncremental extends PurchaseReceiptPacket {
    private int receiptsIndex;
    private int receiptsSize;
}

