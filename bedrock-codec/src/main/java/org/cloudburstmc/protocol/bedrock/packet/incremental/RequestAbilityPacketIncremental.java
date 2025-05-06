package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RequestAbilityPacket;

@Getter
@Setter
public class RequestAbilityPacketIncremental extends RequestAbilityPacket {
    private int abilityIndex;
    private int abilitySize;

    private int typeIndex;
    private int typeSize;

    private int boolValueIndex;
    private int boolValueSize;

    private int floatValueIndex;
    private int floatValueSize;
}

