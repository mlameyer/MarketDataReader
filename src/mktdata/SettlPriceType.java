/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class SettlPriceType
{
    private DirectBuffer buffer;
    private int offset;
    private int actingVersion;

    public SettlPriceType wrap(final DirectBuffer buffer, final int offset, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingVersion = actingVersion;
        return this;
    }

    public int size()
    {
        return 1;
    }

    public SettlPriceType clear()
    {
        CodecUtil.uint8Put(buffer, offset, (short)0);
        return this;
    }

    public boolean Final()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 0);
    }

    public SettlPriceType Final(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 0, value);
        return this;
    }

    public boolean Actual()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 1);
    }

    public SettlPriceType Actual(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 1, value);
        return this;
    }

    public boolean Rounded()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 2);
    }

    public SettlPriceType Rounded(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 2, value);
        return this;
    }

    public boolean Intraday()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 3);
    }

    public SettlPriceType Intraday(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 3, value);
        return this;
    }

    public boolean ReservedBits()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 4);
    }

    public SettlPriceType ReservedBits(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 4, value);
        return this;
    }

    public boolean NullValue()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 7);
    }

    public SettlPriceType NullValue(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 7, value);
        return this;
    }
}
