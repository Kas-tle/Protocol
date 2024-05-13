package org.cloudburstmc.protocol.bedrock.data.entity;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.cloudburstmc.protocol.common.util.NullableEnum;

@Value
@AllArgsConstructor
public class EntityLinkData {
    private final long from;
    private final long to;
    private final Type type;
    private final boolean immediate;
    private final boolean riderInitiated;

    @Deprecated
    public EntityLinkData(long from, long to, Type type, boolean immediate) {
        this(from, to, type, immediate, false);
    }

    public enum Type {
        REMOVE,
        RIDER,
        PASSENGER;

        private static final Type[] VALUES = values();

        public static Type byId(int id) {
            return NullableEnum.get(VALUES, id);
        }
    }
}
