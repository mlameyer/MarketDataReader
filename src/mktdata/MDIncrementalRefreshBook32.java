/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class MDIncrementalRefreshBook32
{
    public static final int BLOCK_LENGTH = 11;
    public static final int TEMPLATE_ID = 32;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 5;

    private final MDIncrementalRefreshBook32 parentMessage = this;
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
        return "X";
    }

    public int offset()
    {
        return offset;
    }

    public MDIncrementalRefreshBook32 wrapForEncode(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = BLOCK_LENGTH;
        this.actingVersion = SCHEMA_VERSION;
        limit(offset + actingBlockLength);

        return this;
    }

    public MDIncrementalRefreshBook32 wrapForDecode(
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

    public MDIncrementalRefreshBook32 transactTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        matchEventIndicator.wrap(buffer, offset + 8, actingVersion);
        return matchEventIndicator;
    }

    private final NoMDEntries noMDEntries = new NoMDEntries();

    public static long NoMDEntriesId()
    {
        return 268;
    }

    public NoMDEntries noMDEntries()
    {
        noMDEntries.wrapForDecode(parentMessage, buffer, actingVersion);
        return noMDEntries;
    }

    public NoMDEntries noMDEntriesCount(final int count)
    {
        noMDEntries.wrapForEncode(parentMessage, buffer, count);
        return noMDEntries;
    }

    public static class NoMDEntries implements Iterable<NoMDEntries>, java.util.Iterator<NoMDEntries>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDIncrementalRefreshBook32 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDIncrementalRefreshBook32 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDIncrementalRefreshBook32 parentMessage, final DirectBuffer buffer, final int count)
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
        public java.util.Iterator<NoMDEntries> iterator()
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
        public NoMDEntries next()
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

        public static int MDEntryPxId()
        {
            return 270;
        }

        public static String MDEntryPxMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Price";
            }

            return "";
        }

        private final PRICENULL mDEntryPx = new PRICENULL();

        public PRICENULL mDEntryPx()
        {
            mDEntryPx.wrap(buffer, offset + 0, actingVersion);//0
            return mDEntryPx;
        }

        public static int MDEntrySizeId()
        {
            return 271;
        }

        public static String MDEntrySizeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Qty";
            }

            return "";
        }

        public static int mDEntrySizeNullValue()
        {
            return 2147483647;
        }

        public static int mDEntrySizeMinValue()
        {
            return -2147483647;
        }

        public static int mDEntrySizeMaxValue()
        {
            return 2147483647;
        }

        public int mDEntrySize()
        {
            return CodecUtil.int32Get(buffer, offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries mDEntrySize(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            return CodecUtil.int32Get(buffer, offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries securityID(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int RptSeqId()
        {
            return 83;
        }

        public static String RptSeqMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static long rptSeqNullValue()
        {
            return 4294967294L;
        }

        public static long rptSeqMinValue()
        {
            return 0L;
        }

        public static long rptSeqMaxValue()
        {
            return 4294967293L;
        }

        public long rptSeq()
        {
            return CodecUtil.uint32Get(buffer, offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries rptSeq(final long value)
        {
            CodecUtil.uint32Put(buffer, offset + 16, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int NumberOfOrdersId()
        {
            return 346;
        }

        public static String NumberOfOrdersMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static int numberOfOrdersNullValue()
        {
            return 2147483647;
        }

        public static int numberOfOrdersMinValue()
        {
            return -2147483647;
        }

        public static int numberOfOrdersMaxValue()
        {
            return 2147483647;
        }

        public int numberOfOrders()
        {
            return CodecUtil.int32Get(buffer, offset + 20, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries numberOfOrders(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 20, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int MDPriceLevelId()
        {
            return 1023;
        }

        public static String MDPriceLevelMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static short mDPriceLevelNullValue()
        {
            return (short)255;
        }

        public static short mDPriceLevelMinValue()
        {
            return (short)0;
        }

        public static short mDPriceLevelMaxValue()
        {
            return (short)254;
        }

        public short mDPriceLevel()
        {
            return CodecUtil.uint8Get(buffer, offset + 24);
        }

        public NoMDEntries mDPriceLevel(final short value)
        {
            CodecUtil.uint8Put(buffer, offset + 24, value);
            return this;
        }

        public static int MDUpdateActionId()
        {
            return 279;
        }

        public static String MDUpdateActionMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public MDUpdateAction mDUpdateAction()
        {
            return MDUpdateAction.get(CodecUtil.uint8Get(buffer, offset + 25));
        }

        public NoMDEntries mDUpdateAction(final MDUpdateAction value)
        {
            CodecUtil.uint8Put(buffer, offset + 25, value.value());
            return this;
        }

        public static int MDEntryTypeId()
        {
            return 269;
        }

        public static String MDEntryTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "char";
            }

            return "";
        }

        public MDEntryTypeBook mDEntryType()
        {
            return MDEntryTypeBook.get(CodecUtil.charGet(buffer, offset + 26));
        }

        public NoMDEntries mDEntryType(final MDEntryTypeBook value)
        {
            CodecUtil.charPut(buffer, offset + 26, value.value());
            return this;
        }
    }
}