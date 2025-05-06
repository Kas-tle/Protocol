package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.BlockEventPacket;

/**
 * Used to trigger Note blocks, Chests and End Gateways
 *
 * <h2>Examples</h2>
 *
 * <h3>Note Block</h3>
 * <blockquote>
 *     eventType: (Instrument)
 *     <ul>
 *         <li>0 (Piano)</li>
 *         <li>1 (Base Drum)</li>
 *         <li>2 (Sticks)</li>
 *         <li>3 (Drum)</li>
 *         <li>4 (Bass)</li>
 *     </ul>
 *     data: 0-15
 * </blockquote>
 *
 * <h3>Chest Block</h3>
 * <blockquote>
 *     eventType: 1 (Chest open/closed)<br>
 *     data: 0 or 1
 * </blockquote>
 *
 * <h3>End Gateway</h3>
 * <blockquote>
 *     eventType: 1 (Cool down)<br>
 *     data: n/a
 * </blockquote>
 *
 **/
@Getter
@Setter
public class BlockEventPacketIncremental extends BlockEventPacket implements BedrockPacketIncremental {
    private int blockPositionIndex;
    private int blockPositionSize;

    private int eventTypeIndex;
    private int eventTypeSize;

    private int eventDataIndex;
    private int eventDataSize;
}

