package org.cloudburstmc.protocol.bedrock.packet;

import com.nukkitx.math.vector.Vector3i;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.cloudburstmc.protocol.common.PacketSignal;

import java.util.List;

@Data
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class SubChunkRequestPacket implements BedrockPacket {
    private int dimension;
    private Vector3i subChunkPosition;
    /**
     * @since v485
     */
    private long requestCount;
    private List<Vector3i> positionOffsets = new ObjectArrayList<>();

    @Override
    public final PacketSignal handle(BedrockPacketHandler handler) {
        return handler.handle(this);
    }

    public BedrockPacketType getPacketType() {
        return BedrockPacketType.SUB_CHUNK_REQUEST;
    }
}
