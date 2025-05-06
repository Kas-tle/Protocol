package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.ScriptCustomEventPacket;

/**
 * Deprecated since v594
 */
@Deprecated
@Getter
@Setter
public class ScriptCustomEventPacketIncremental extends ScriptCustomEventPacket {
    private int eventNameIndex;
    private int eventNameSize;

    private int dataIndex;
    private int dataSize;
}


