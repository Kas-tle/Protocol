package org.cloudburstmc.protocol.bedrock.codec.v748.serializer;

import io.netty.buffer.ByteBuf;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.BedrockPacketSerializer;
import org.cloudburstmc.protocol.bedrock.data.AuthoritativeMovementMode;
import org.cloudburstmc.protocol.bedrock.packet.SetMovementAuthorityPacket;
import org.cloudburstmc.protocol.common.util.NullableEnum;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class SetMovementAuthoritySerializer_v748 implements BedrockPacketSerializer<SetMovementAuthorityPacket> {
    public static final SetMovementAuthoritySerializer_v748 INSTANCE = new SetMovementAuthoritySerializer_v748();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, SetMovementAuthorityPacket packet) {
        buffer.writeByte(packet.getMovementMode().ordinal());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, SetMovementAuthorityPacket packet) {
        packet.setMovementMode(NullableEnum.get(AuthoritativeMovementMode.values(), buffer.readUnsignedByte()));
    }
}