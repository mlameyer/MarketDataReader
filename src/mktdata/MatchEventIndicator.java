/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class MatchEventIndicator
{
    private DirectBuffer buffer;
    private int offset;
    private int actingVersion;

    public MatchEventIndicator wrap(final DirectBuffer buffer, final int offset, final int actingVersion)
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

    public MatchEventIndicator clear()
    {
        CodecUtil.uint8Put(buffer, offset, (short)0);
        return this;
    }

    public boolean LastTradeMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 0);
    }

    public MatchEventIndicator LastTradeMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 0, value);
        return this;
    }

    public boolean LastVolumeMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 1);
    }

    public MatchEventIndicator LastVolumeMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 1, value);
        return this;
    }

    public boolean LastQuoteMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 2);
    }

    public MatchEventIndicator LastQuoteMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 2, value);
        return this;
    }

    public boolean LastStatsMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 3);
    }

    public MatchEventIndicator LastStatsMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 3, value);
        return this;
    }

    public boolean LastImpliedMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 4);
    }

    public MatchEventIndicator LastImpliedMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 4, value);
        return this;
    }

    public boolean RecoveryMsg()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 5);
    }

    public MatchEventIndicator RecoveryMsg(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 5, value);
        return this;
    }

    public boolean Reserved()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 6);
    }

    public MatchEventIndicator Reserved(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 6, value);
        return this;
    }

    public boolean EndOfEvent()
    {
        return CodecUtil.uint8GetChoice(buffer, offset, 7);
    }

    public MatchEventIndicator EndOfEvent(final boolean value)
    {
        CodecUtil.uint8PutChoice(buffer, offset, 7, value);
        return this;
    }
}
