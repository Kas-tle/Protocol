package org.cloudburstmc.protocol.bedrock.codec.v944.serializer;

import io.netty.buffer.ByteBuf;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.v924.serializer.StartGameSerializer_v924;
import org.cloudburstmc.protocol.bedrock.data.ClientStoreEntrypointConfiguration;
import org.cloudburstmc.protocol.bedrock.data.GatheringsConfigurationJoinInfo;
import org.cloudburstmc.protocol.bedrock.data.ServerConfigurationJoinInfo;

public class StartGameSerializer_v944 extends StartGameSerializer_v924 {

    public static final StartGameSerializer_v944 INSTANCE = new StartGameSerializer_v944();

    @Override
    protected void writeServerJoinInfo(ByteBuf buffer, BedrockCodecHelper helper, ServerConfigurationJoinInfo info) {
        helper.writeOptionalNull(buffer, info.getGatheringsConfigurationJoinInfo(), this::writeGatheringsConfiguration);
        helper.writeOptionalNull(buffer, info.getClientStoreEntrypointConfiguration(), this::writeClientStoreEntrypointConfiguration);
        buffer.writeBoolean(info.isHasPresenceConfiguration());
    }

    private void writeClientStoreEntrypointConfiguration(ByteBuf buf, BedrockCodecHelper h, ClientStoreEntrypointConfiguration store) {
        h.writeString(buf, store.getStoreId());
        h.writeString(buf, store.getStoreName());
    }

    private void writeGatheringsConfiguration(ByteBuf buf, BedrockCodecHelper h, GatheringsConfigurationJoinInfo info) {
        h.writeUuid(buf, info.getExperienceId());
        h.writeString(buf, info.getExperienceName());
        h.writeUuid(buf, info.getWorldId());
        h.writeString(buf, info.getWorldName());
        h.writeString(buf, info.getCreatorId());
        h.writeUuid(buf, info.getTargetId());
        h.writeString(buf, info.getScenarioId());
        h.writeString(buf, info.getServerId());
    }

    @Override
    protected ServerConfigurationJoinInfo readServerJoinInfo(ByteBuf buffer, BedrockCodecHelper helper) {
        GatheringsConfigurationJoinInfo gatheringsConfigurationJoinInfo = helper.readOptional(buffer, null, this::readGatheringsConfiguration);
        ClientStoreEntrypointConfiguration clientStoreEntrypointConfiguration = helper.readOptional(buffer, null, this::readClientStoreEntrypointConfiguration);
        boolean hasPresenceConfiguration = buffer.readBoolean();

        return new ServerConfigurationJoinInfo(gatheringsConfigurationJoinInfo, clientStoreEntrypointConfiguration, hasPresenceConfiguration);
    }

    private ClientStoreEntrypointConfiguration readClientStoreEntrypointConfiguration(ByteBuf buf, BedrockCodecHelper h) {
        return new ClientStoreEntrypointConfiguration(
                h.readString(buf),
                h.readString(buf)
        );
    }

    private GatheringsConfigurationJoinInfo readGatheringsConfiguration(ByteBuf buf, BedrockCodecHelper h) {
        return new GatheringsConfigurationJoinInfo(
                h.readUuid(buf),
                h.readString(buf),
                h.readUuid(buf),
                h.readString(buf),
                h.readString(buf),
                h.readUuid(buf),
                h.readString(buf),
                h.readString(buf)
        );
    }
}
