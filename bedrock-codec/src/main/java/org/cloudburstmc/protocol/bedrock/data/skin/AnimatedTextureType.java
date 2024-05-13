package org.cloudburstmc.protocol.bedrock.data.skin;

import org.cloudburstmc.protocol.common.util.NullableEnum;

public enum AnimatedTextureType {
    NONE,
    FACE,
    BODY_32X32,
    BODY_128X128;

    private static final AnimatedTextureType[] VALUES = values();

    public static AnimatedTextureType from(int id) {
        return NullableEnum.get(VALUES, id);
    }
}
