/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class InstAttribValue
{
    private DirectBuffer buffer;
    private int offset;
    private int actingVersion;

    public InstAttribValue wrap(final DirectBuffer buffer, final int offset, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingVersion = actingVersion;
        return this;
    }

    public int size()
    {
        return 4;
    }

    public InstAttribValue clear()
    {
        CodecUtil.uint32Put(buffer, offset, 0L, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean ElectronicMatchEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue ElectronicMatchEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean OrderCrossEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue OrderCrossEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 1, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean BlockTradeEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 2, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue BlockTradeEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 2, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean EFPEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 3, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue EFPEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 3, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean EBFEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 4, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue EBFEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean EFSEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 5, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue EFSEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 5, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean EFREligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 6, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue EFREligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 6, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean OTCEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 7, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue OTCEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 7, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean iLinkIndicativeMassQuotingEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 8, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue iLinkIndicativeMassQuotingEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean NegativeStrikeEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 9, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue NegativeStrikeEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 9, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean NegativePriceOutrightEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 10, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue NegativePriceOutrightEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 10, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean IsFractional()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 11, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue IsFractional(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 11, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean VolatilityQuotedOption()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 12, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue VolatilityQuotedOption(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean RFQCrossEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 13, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue RFQCrossEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 13, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean ZeroPriceOutrightEligible()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 14, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue ZeroPriceOutrightEligible(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 14, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean DecayingProductEligibility()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 15, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue DecayingProductEligibility(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 15, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean VariableProductEligibility()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 16, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue VariableProductEligibility(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 16, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean DailyProductEligibility()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 17, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue DailyProductEligibility(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 17, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean GTOrdersEligibility()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 18, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue GTOrdersEligibility(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 18, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public boolean ImpliedMatchingEligibility()
    {
        return CodecUtil.uint32GetChoice(buffer, offset, 19, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public InstAttribValue ImpliedMatchingEligibility(final boolean value)
    {
        CodecUtil.uint32PutChoice(buffer, offset, 19, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
