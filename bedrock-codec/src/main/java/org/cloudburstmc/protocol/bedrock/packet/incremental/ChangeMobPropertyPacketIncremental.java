package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ChangeMobPropertyPacket;

/**
 * Server-bound packet to change the properties of a mob.
 *
 * @since v503
 */
@Getter
@Setter
public class ChangeMobPropertyPacketIncremental extends ChangeMobPropertyPacket implements BedrockPacketIncremental {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int propertyIndex;
    private int propertySize;

    private int boolValueIndex;
    private int boolValueSize;

    private int stringValueIndex;
    private int stringValueSize;

    private int intValueIndex;
    private int intValueSize;

    private int floatValueIndex;
    private int floatValueSize;
}

