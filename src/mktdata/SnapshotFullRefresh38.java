/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class SnapshotFullRefresh38
{
    public static final int BLOCK_LENGTH = 59;
    public static final int TEMPLATE_ID = 38;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 5;

    private final SnapshotFullRefresh38 parentMessage = this;
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
        return "W";
    }

    public int offset()
    {
        return offset;
    }

    public SnapshotFullRefresh38 wrapForEncode(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = BLOCK_LENGTH;
        this.actingVersion = SCHEMA_VERSION;
        limit(offset + actingBlockLength);

        return this;
    }

    public SnapshotFullRefresh38 wrapForDecode(
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

    public static int LastMsgSeqNumProcessedId()
    {
        return 369;
    }

    public static String LastMsgSeqNumProcessedMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "SeqNum";
        }

        return "";
    }

    public static long lastMsgSeqNumProcessedNullValue()
    {
        return 4294967294L;
    }

    public static long lastMsgSeqNumProcessedMinValue()
    {
        return 0L;
    }

    public static long lastMsgSeqNumProcessedMaxValue()
    {
        return 4294967293L;
    }

    public long lastMsgSeqNumProcessed()
    {
        return CodecUtil.uint32Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 lastMsgSeqNumProcessed(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int TotNumReportsId()
    {
        return 911;
    }

    public static String TotNumReportsMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static long totNumReportsNullValue()
    {
        return 4294967294L;
    }

    public static long totNumReportsMinValue()
    {
        return 0L;
    }

    public static long totNumReportsMaxValue()
    {
        return 4294967293L;
    }

    public long totNumReports()
    {
        return CodecUtil.uint32Get(buffer, offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 totNumReports(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return CodecUtil.int32Get(buffer, offset + 8, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 securityID(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 8, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            case SEMANTIC_TYPE: return "SeqNum";
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
        return CodecUtil.uint32Get(buffer, offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 rptSeq(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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
        return CodecUtil.uint64Get(buffer, offset + 16, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 transactTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 16, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int LastUpdateTimeId()
    {
        return 779;
    }

    public static String LastUpdateTimeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "UTCTimestamp";
        }

        return "";
    }

    public static long lastUpdateTimeNullValue()
    {
        return 0xffffffffffffffffL;
    }

    public static long lastUpdateTimeMinValue()
    {
        return 0x0L;
    }

    public static long lastUpdateTimeMaxValue()
    {
        return 0xfffffffffffffffeL;
    }

    public long lastUpdateTime()
    {
        return CodecUtil.uint64Get(buffer, offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 lastUpdateTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 24, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int TradeDateId()
    {
        return 75;
    }

    public static String TradeDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "LocalMktDate";
        }

        return "";
    }

    public static int tradeDateNullValue()
    {
        return 65535;
    }

    public static int tradeDateMinValue()
    {
        return 0;
    }

    public static int tradeDateMaxValue()
    {
        return 65534;
    }

    public int tradeDate()
    {
        return CodecUtil.uint16Get(buffer, offset + 32, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public SnapshotFullRefresh38 tradeDate(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 32, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int MDSecurityTradingStatusId()
    {
        return 1682;
    }

    public static String MDSecurityTradingStatusMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public SecurityTradingStatus mDSecurityTradingStatus()
    {
        return SecurityTradingStatus.get(CodecUtil.uint8Get(buffer, offset + 34));
    }

    public SnapshotFullRefresh38 mDSecurityTradingStatus(final SecurityTradingStatus value)
    {
        CodecUtil.uint8Put(buffer, offset + 34, value.value());
        return this;
    }

    public static int HighLimitPriceId()
    {
        return 1149;
    }

    public static String HighLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL highLimitPrice = new PRICENULL();

    public PRICENULL highLimitPrice()
    {
        highLimitPrice.wrap(buffer, offset + 35, actingVersion);
        return highLimitPrice;
    }

    public static int LowLimitPriceId()
    {
        return 1148;
    }

    public static String LowLimitPriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL lowLimitPrice = new PRICENULL();

    public PRICENULL lowLimitPrice()
    {
        lowLimitPrice.wrap(buffer, offset + 43, actingVersion);
        return lowLimitPrice;
    }

    public static int MaxPriceVariationId()
    {
        return 1143;
    }

    public static String MaxPriceVariationMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL maxPriceVariation = new PRICENULL();

    public PRICENULL maxPriceVariation()
    {
        maxPriceVariation.wrap(buffer, offset + 51, actingVersion);
        return maxPriceVariation;
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
        private SnapshotFullRefresh38 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final SnapshotFullRefresh38 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final SnapshotFullRefresh38 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)22);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 22;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 22;
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
            mDEntryPx.wrap(buffer, offset + 0, actingVersion);
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
            return CodecUtil.int32Get(buffer, offset + 12, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries numberOfOrders(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 12, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        public static byte mDPriceLevelNullValue()
        {
            return (byte)127;
        }

        public static byte mDPriceLevelMinValue()
        {
            return (byte)-127;
        }

        public static byte mDPriceLevelMaxValue()
        {
            return (byte)127;
        }

        public byte mDPriceLevel()
        {
            return CodecUtil.int8Get(buffer, offset + 16);
        }

        public NoMDEntries mDPriceLevel(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 16, value);
            return this;
        }

        public static int TradingReferenceDateId()
        {
            return 5796;
        }

        public static String TradingReferenceDateMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "LocalMktDate";
            }

            return "";
        }

        public static int tradingReferenceDateNullValue()
        {
            return 65535;
        }

        public static int tradingReferenceDateMinValue()
        {
            return 0;
        }

        public static int tradingReferenceDateMaxValue()
        {
            return 65534;
        }

        public int tradingReferenceDate()
        {
            return CodecUtil.uint16Get(buffer, offset + 17, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoMDEntries tradingReferenceDate(final int value)
        {
            CodecUtil.uint16Put(buffer, offset + 17, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int OpenCloseSettlFlagId()
        {
            return 286;
        }

        public static String OpenCloseSettlFlagMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public OpenCloseSettlFlag openCloseSettlFlag()
        {
            return OpenCloseSettlFlag.get(CodecUtil.uint8Get(buffer, offset + 19));
        }

        public NoMDEntries openCloseSettlFlag(final OpenCloseSettlFlag value)
        {
            CodecUtil.uint8Put(buffer, offset + 19, value.value());
            return this;
        }

        public static int SettlPriceTypeId()
        {
            return 731;
        }

        public static String SettlPriceTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "MultipleCharValue";
            }

            return "";
        }

        private final SettlPriceType settlPriceType = new SettlPriceType();

        public SettlPriceType settlPriceType()
        {
            settlPriceType.wrap(buffer, offset + 20, actingVersion);
            return settlPriceType;
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

        public MDEntryType mDEntryType()
        {
            return MDEntryType.get(CodecUtil.charGet(buffer, offset + 21));
        }

        public NoMDEntries mDEntryType(final MDEntryType value)
        {
            CodecUtil.charPut(buffer, offset + 21, value.value());
            return this;
        }
    }
}
