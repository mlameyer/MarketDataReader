/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class QuoteRequest39
{
    public static final int BLOCK_LENGTH = 35;
    public static final int TEMPLATE_ID = 39;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 5;

    private final QuoteRequest39 parentMessage = this;
    private DirectBuffer buffer;
    private int offset;
    private int limit;
    private int actingBlockLength;
    private int actingVersion;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "R";
    }

    public int offset()
    {
        return offset;
    }

    public QuoteRequest39 wrapForEncode(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = BLOCK_LENGTH;
        this.actingVersion = SCHEMA_VERSION;
        limit(offset + actingBlockLength);

        return this;
    }

    public QuoteRequest39 wrapForDecode(
        final DirectBuffer buffer, final int offset, final int actingBlockLength, final int actingVersion)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public int size()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        buffer.checkLimit(limit);
        this.limit = limit;
    }

    public static int TransactTimeId()
    {
        return 60;
    }

    public static String TransactTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "UTCTimestamp";
        }

        return "";
    }

    public static long transactTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long transactTimeMinValue()
    {
        return 0x0L;
    }

    public static long transactTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long transactTime()
    {
        return CodecUtil.uint64Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public QuoteRequest39 transactTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int QuoteReqIDId()
    {
        return 131;
    }

    public static String QuoteReqIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte quoteReqIDNullValue()
    {
        return (byte)0;
    }

    public static byte quoteReqIDMinValue()
    {
        return (byte)32;
    }

    public static byte quoteReqIDMaxValue()
    {
        return (byte)126;
    }

    public static int quoteReqIDLength()
    {
        return 23;
    }

    public byte quoteReqID(final int index)
    {
        if (index < 0 || index >= 23)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 8 + (index * 1));
    }

    public void quoteReqID(final int index, final byte value)
    {
        if (index < 0 || index >= 23)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 8 + (index * 1), value);
    }

    public static String quoteReqIDCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getQuoteReqID(final byte[] dst, final int dstOffset)
    {
        final int length = 23;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 8, dst, dstOffset, length);
        return length;
    }

    public QuoteRequest39 putQuoteReqID(final byte[] src, final int srcOffset)
    {
        final int length = 23;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 8, src, srcOffset, length);
        return this;
    }

    public static int MatchEventIndicatorId()
    {
        return 5799;
    }

    public static String MatchEventIndicatorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "MultipleCharValue";
        }

        return "";
    }

    private final MatchEventIndicator matchEventIndicator = new MatchEventIndicator();

    public MatchEventIndicator matchEventIndicator()
    {
        matchEventIndicator.wrap(buffer, offset + 31, actingVersion);
        return matchEventIndicator;
    }

    private final NoRelatedSym noRelatedSym = new NoRelatedSym();

    public static long NoRelatedSymId()
    {
        return 146;
    }

    public NoRelatedSym noRelatedSym()
    {
        noRelatedSym.wrapForDecode(parentMessage, buffer, actingVersion);
        return noRelatedSym;
    }

    public NoRelatedSym noRelatedSymCount(final int count)
    {
        noRelatedSym.wrapForEncode(parentMessage, buffer, count);
        return noRelatedSym;
    }

    public static class NoRelatedSym implements Iterable<NoRelatedSym>, java.util.Iterator<NoRelatedSym>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private QuoteRequest39 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final QuoteRequest39 parentMessage, final DirectBuffer buffer, final int actingVersion)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            blockLength = dimensions.blockLength();
            count = dimensions.numInGroup();
            this.actingVersion = actingVersion;
            index = -1;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public void wrapForEncode(final QuoteRequest39 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)32);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 32;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 32;
        }

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        @Override
        public java.util.Iterator<NoRelatedSym> iterator()
        {
            return this;
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean hasNext()
        {
            return (index + 1) < count;
        }

        @Override
        public NoRelatedSym next()
        {
            if (index + 1 >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
        }

        public static int SymbolId()
        {
            return 55;
        }

        public static String SymbolMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "String";
            }

            return "";
        }

        public static byte symbolNullValue()
        {
            return (byte)0;
        }

        public static byte symbolMinValue()
        {
            return (byte)32;
        }

        public static byte symbolMaxValue()
        {
            return (byte)126;
        }

        public static int symbolLength()
        {
            return 20;
        }

        public byte symbol(final int index)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            return CodecUtil.charGet(buffer, this.offset + 0 + (index * 1));
        }

        public void symbol(final int index, final byte value)
        {
            if (index < 0 || index >= 20)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            CodecUtil.charPut(buffer, this.offset + 0 + (index * 1), value);
        }

        public static String symbolCharacterEncoding()
        {
            return "UTF-8";
        }

        public int getSymbol(final byte[] dst, final int dstOffset)
        {
            final int length = 20;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException(                    "dstOffset out of range for copy: offset=" + dstOffset);
            }

            CodecUtil.charsGet(buffer, this.offset + 0, dst, dstOffset, length);
            return length;
        }

        public NoRelatedSym putSymbol(final byte[] src, final int srcOffset)
        {
            final int length = 20;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException(                    "srcOffset out of range for copy: offset=" + srcOffset);
            }

            CodecUtil.charsPut(buffer, this.offset + 0, src, srcOffset, length);
            return this;
        }

        public static int SecurityIDId()
        {
            return 48;
        }

        public static String SecurityIDMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static int securityIDNullValue()
        {
            return -2147483648;
        }

        public static int securityIDMinValue()
        {
            return -2147483647;
        }

        public static int securityIDMaxValue()
        {
            return 2147483647;
        }

        public int securityID()
        {
            return CodecUtil.int32Get(buffer, offset + 20, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoRelatedSym securityID(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 20, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int OrderQtyId()
        {
            return 38;
        }

        public static String OrderQtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Qty";
            }

            return "";
        }

        public static int orderQtyNullValue()
        {
            return 2147483647;
        }

        public static int orderQtyMinValue()
        {
            return -2147483647;
        }

        public static int orderQtyMaxValue()
        {
            return 2147483647;
        }

        public int orderQty()
        {
            return CodecUtil.int32Get(buffer, offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoRelatedSym orderQty(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 24, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int QuoteTypeId()
        {
            return 537;
        }

        public static String QuoteTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static byte quoteTypeNullValue()
        {
            return (byte)-128;
        }

        public static byte quoteTypeMinValue()
        {
            return (byte)-127;
        }

        public static byte quoteTypeMaxValue()
        {
            return (byte)127;
        }

        public byte quoteType()
        {
            return CodecUtil.int8Get(buffer, offset + 28);
        }

        public NoRelatedSym quoteType(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 28, value);
            return this;
        }

        public static int SideId()
        {
            return 54;
        }

        public static String SideMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static byte sideNullValue()
        {
            return (byte)127;
        }

        public static byte sideMinValue()
        {
            return (byte)-127;
        }

        public static byte sideMaxValue()
        {
            return (byte)127;
        }

        public byte side()
        {
            return CodecUtil.int8Get(buffer, offset + 29);
        }

        public NoRelatedSym side(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 29, value);
            return this;
        }
    }
}
