/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class GroupSize8Byte
{
    private DirectBuffer buffer;
    private int offset;
    private int actingVersion;

    public GroupSize8Byte wrap(final DirectBuffer buffer, final int offset, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingVersion = actingVersion;
        return this;
    }

    public int size()
    {
        return 8;
    }

    public static int blockLengthNullValue()
    {
        return 65535;
    }

    public static int blockLengthMinValue()
    {
        return 0;
    }

    public static int blockLengthMaxValue()
    {
        return 65534;
    }

    public int blockLength()
    {
        return CodecUtil.uint16Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public GroupSize8Byte blockLength(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short numInGroupNullValue()
    {
        return (short)255;
    }

    public static short numInGroupMinValue()
    {
        return (short)0;
    }

    public static short numInGroupMaxValue()
    {
        return (short)254;
    }

    public short numInGroup()
    {
        return CodecUtil.uint8Get(buffer, offset + 7);
    }

    public GroupSize8Byte numInGroup(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 7, value);
        return this;
    }
}
