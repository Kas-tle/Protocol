package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.RequestPermissionsPacket;

@Getter
@Setter
public class RequestPermissionsPacketIncremental extends RequestPermissionsPacket {
    private int uniqueEntityIdIndex;
    private int uniqueEntityIdSize;

    private int permissionsIndex;
    private int permissionsSize;

    private int customPermissionsIndex;
    private int customPermissionsSize;
}

