package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.AnimateEntityPacket;

/**
 * Used to trigger an entity animation on the specified runtime IDs to the client that receives it.
 */
@Getter
@Setter
public class AnimateEntityPacketIncremental extends AnimateEntityPacket implements BedrockPacketIncremental {
    private int animationIndex;
    private int animationSize;

    private int nextStateIndex;
    private int nextStateSize;

    private int stopExpressionIndex;
    private int stopExpressionSize;

    private int stopExpressionVersionIndex;
    private int stopExpressionVersionSize;

    private int controllerIndex;
    private int controllerSize;

    private int blendOutTimeIndex;
    private int blendOutTimeSize;

    private int runtimeEntityIdsIndex;
    private int runtimeEntityIdsSize;
}

