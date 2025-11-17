package org.cloudburstmc.protocol.bedrock.data.auth;

import lombok.Getter;
import org.cloudburstmc.protocol.common.util.Preconditions;

import java.util.List;

public class DualPayload implements AuthPayload {

    @Getter
    private final List<String> chain;
    @Getter
    private final String token;
    private final AuthType type;

    public DualPayload(List<String> chain, String token, AuthType type) {
        Preconditions.checkArgument(type != AuthType.UNKNOWN, "DualPayload cannot be of type UNKNOWN");
        this.chain = chain;
        this.token = token;
        this.type = type;
    }

    @Override
    public AuthType getAuthType() {
        return type;
    }
}
