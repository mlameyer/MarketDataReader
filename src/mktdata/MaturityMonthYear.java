/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class MaturityMonthYear
{
    private DirectBuffer buffer;
    private int offset;
    private int actingVersion;

    public MaturityMonthYear wrap(final DirectBuffer buffer, final int offset, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingVersion = actingVersion;
        return this;
    }

    public int size()
    {
        return 5;
    }

    public static int yearNullValue()
    {
        return 65535;
    }

    public static int yearMinValue()
    {
        return 0;
    }

    public static int yearMaxValue()
    {
        return 65534;
    }

    public int year()
    {
        return CodecUtil.uint16Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MaturityMonthYear year(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static short monthNullValue()
    {
        return (short)255;
    }

    public static short monthMinValue()
    {
        return (short)0;
    }

    public static short monthMaxValue()
    {
        return (short)254;
    }

    public short month()
    {
        return CodecUtil.uint8Get(buffer, offset + 2);
    }

    public MaturityMonthYear month(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 2, value);
        return this;
    }

    public static short dayNullValue()
    {
        return (short)255;
    }

    public static short dayMinValue()
    {
        return (short)0;
    }

    public static short dayMaxValue()
    {
        return (short)254;
    }

    public short day()
    {
        return CodecUtil.uint8Get(buffer, offset + 3);
    }

    public MaturityMonthYear day(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 3, value);
        return this;
    }

    public static short weekNullValue()
    {
        return (short)255;
    }

    public static short weekMinValue()
    {
        return (short)0;
    }

    public static short weekMaxValue()
    {
        return (short)254;
    }

    public short week()
    {
        return CodecUtil.uint8Get(buffer, offset + 4);
    }

    public MaturityMonthYear week(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 4, value);
        return this;
    }
}
