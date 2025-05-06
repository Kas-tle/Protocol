package org.cloudburstmc.protocol.bedrock.packet.incremental;

import lombok.Getter;
import lombok.Setter;
import org.cloudburstmc.protocol.bedrock.packet.PhotoTransferPacket;

@Getter
@Setter
public class PhotoTransferPacketIncremental extends PhotoTransferPacket {
    private int nameIndex;
    private int nameSize;

    private int dataIndex;
    private int dataSize;

    private int bookIdIndex;
    private int bookIdSize;

    private int photoTypeIndex;
    private int photoTypeSize;

    private int sourceTypeIndex;
    private int sourceTypeSize;

    private int ownerIdIndex;
    private int ownerIdSize;

    private int newPhotoNameIndex;
    private int newPhotoNameSize;
}

