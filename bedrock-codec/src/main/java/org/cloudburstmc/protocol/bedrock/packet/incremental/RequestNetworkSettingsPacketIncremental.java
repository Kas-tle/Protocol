package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.NetworkSettingsPacket;
import org.cloudburstmc.protocol.bedrock.packet.RequestNetworkSettingsPacket;

/**
 * Initial packet sent in the login sequence by the client. The server is expected to respond to
 * this packet with the {@link NetworkSettingsPacket} and apply the compression settings that
 * are defined in the packet.
 */
@Getter
@Setter
public class RequestNetworkSettingsPacketIncremental extends RequestNetworkSettingsPacket {
    private int protocolVersionIndex;
    private int protocolVersionSize;
}
