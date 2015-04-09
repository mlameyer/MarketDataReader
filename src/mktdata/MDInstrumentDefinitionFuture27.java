/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class MDInstrumentDefinitionFuture27
{
    public static final int BLOCK_LENGTH = 214;
    public static final int TEMPLATE_ID = 27;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 5;

    private final MDInstrumentDefinitionFuture27 parentMessage = this;
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
        return "d";
    }

    public int offset()
    {
        return offset;
    }

    public MDInstrumentDefinitionFuture27 wrapForEncode(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = BLOCK_LENGTH;
        this.actingVersion = SCHEMA_VERSION;
        limit(offset + actingBlockLength);

        return this;
    }

    public MDInstrumentDefinitionFuture27 wrapForDecode(
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
        matchEventIndicator.wrap(buffer, offset + 0, actingVersion);
        return matchEventIndicator;
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
        return 4294967295L;
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
        return CodecUtil.uint32Get(buffer, offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 totNumReports(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 1, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int SecurityUpdateActionId()
    {
        return 980;
    }

    public static String SecurityUpdateActionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "char";
        }

        return "";
    }

    public SecurityUpdateAction securityUpdateAction()
    {
        return SecurityUpdateAction.get(CodecUtil.charGet(buffer, offset + 5));
    }

    public MDInstrumentDefinitionFuture27 securityUpdateAction(final SecurityUpdateAction value)
    {
        CodecUtil.charPut(buffer, offset + 5, value.value());
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
        return CodecUtil.uint64Get(buffer, offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 lastUpdateTime(final long value)
    {
        CodecUtil.uint64Put(buffer, offset + 6, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return SecurityTradingStatus.get(CodecUtil.uint8Get(buffer, offset + 14));
    }

    public MDInstrumentDefinitionFuture27 mDSecurityTradingStatus(final SecurityTradingStatus value)
    {
        CodecUtil.uint8Put(buffer, offset + 14, value.value());
        return this;
    }

    public static int ApplIDId()
    {
        return 1180;
    }

    public static String ApplIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short applIDNullValue()
    {
        return (short)-32768;
    }

    public static short applIDMinValue()
    {
        return (short)-32767;
    }

    public static short applIDMaxValue()
    {
        return (short)32767;
    }

    public short applID()
    {
        return CodecUtil.int16Get(buffer, offset + 15, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 applID(final short value)
    {
        CodecUtil.int16Put(buffer, offset + 15, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int MarketSegmentIDId()
    {
        return 1300;
    }

    public static String MarketSegmentIDMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short marketSegmentIDNullValue()
    {
        return (short)255;
    }

    public static short marketSegmentIDMinValue()
    {
        return (short)0;
    }

    public static short marketSegmentIDMaxValue()
    {
        return (short)254;
    }

    public short marketSegmentID()
    {
        return CodecUtil.uint8Get(buffer, offset + 17);
    }

    public MDInstrumentDefinitionFuture27 marketSegmentID(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 17, value);
        return this;
    }

    public static int UnderlyingProductId()
    {
        return 462;
    }

    public static String UnderlyingProductMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short underlyingProductNullValue()
    {
        return (short)255;
    }

    public static short underlyingProductMinValue()
    {
        return (short)0;
    }

    public static short underlyingProductMaxValue()
    {
        return (short)254;
    }

    public short underlyingProduct()
    {
        return CodecUtil.uint8Get(buffer, offset + 18);
    }

    public MDInstrumentDefinitionFuture27 underlyingProduct(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 18, value);
        return this;
    }

    public static int SecurityExchangeId()
    {
        return 207;
    }

    public static String SecurityExchangeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Exchange";
        }

        return "";
    }

    public static byte securityExchangeNullValue()
    {
        return (byte)0;
    }

    public static byte securityExchangeMinValue()
    {
        return (byte)32;
    }

    public static byte securityExchangeMaxValue()
    {
        return (byte)126;
    }

    public static int securityExchangeLength()
    {
        return 4;
    }

    public byte securityExchange(final int index)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 19 + (index * 1));
    }

    public void securityExchange(final int index, final byte value)
    {
        if (index < 0 || index >= 4)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 19 + (index * 1), value);
    }

    public static String securityExchangeCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getSecurityExchange(final byte[] dst, final int dstOffset)
    {
        final int length = 4;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 19, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putSecurityExchange(final byte[] src, final int srcOffset)
    {
        final int length = 4;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 19, src, srcOffset, length);
        return this;
    }

    public static int SecurityGroupId()
    {
        return 1151;
    }

    public static String SecurityGroupMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte securityGroupNullValue()
    {
        return (byte)0;
    }

    public static byte securityGroupMinValue()
    {
        return (byte)32;
    }

    public static byte securityGroupMaxValue()
    {
        return (byte)126;
    }

    public static int securityGroupLength()
    {
        return 6;
    }

    public byte securityGroup(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 23 + (index * 1));
    }

    public void securityGroup(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 23 + (index * 1), value);
    }

    public static String securityGroupCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getSecurityGroup(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 23, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putSecurityGroup(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 23, src, srcOffset, length);
        return this;
    }

    public static int AssetId()
    {
        return 6937;
    }

    public static String AssetMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte assetNullValue()
    {
        return (byte)0;
    }

    public static byte assetMinValue()
    {
        return (byte)32;
    }

    public static byte assetMaxValue()
    {
        return (byte)126;
    }

    public static int assetLength()
    {
        return 6;
    }

    public byte asset(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 29 + (index * 1));
    }

    public void asset(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 29 + (index * 1), value);
    }

    public static String assetCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getAsset(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 29, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putAsset(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 29, src, srcOffset, length);
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

        return CodecUtil.charGet(buffer, this.offset + 35 + (index * 1));
    }

    public void symbol(final int index, final byte value)
    {
        if (index < 0 || index >= 20)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 35 + (index * 1), value);
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
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 35, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putSymbol(final byte[] src, final int srcOffset)
    {
        final int length = 20;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 35, src, srcOffset, length);
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
        return CodecUtil.int32Get(buffer, offset + 55, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 securityID(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 55, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int SecurityIDSourceId()
    {
        return 22;
    }

    public static String SecurityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "char";
        }

        return "";
    }

    public static byte securityIDSourceNullValue()
    {
        return (byte)0;
    }

    public static byte securityIDSourceMinValue()
    {
        return (byte)32;
    }

    public static byte securityIDSourceMaxValue()
    {
        return (byte)126;
    }

    private static final byte[] securityIDSourceValue = {56};

    public static int securityIDSourceLength()
    {
        return 1;
    }

    public byte securityIDSource(final int index)
    {
        return securityIDSourceValue[index];
    }

    public int getSecurityIDSource(final byte[] dst, final int offset, final int length)
    {
        final int bytesCopied = Math.min(length, 1);
        System.arraycopy(securityIDSourceValue, 0, dst, offset, bytesCopied);
        return bytesCopied;
    }

    public static int SecurityTypeId()
    {
        return 167;
    }

    public static String SecurityTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte securityTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securityTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securityTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securityTypeLength()
    {
        return 6;
    }

    public byte securityType(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 59 + (index * 1));
    }

    public void securityType(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 59 + (index * 1), value);
    }

    public static String securityTypeCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getSecurityType(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 59, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putSecurityType(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 59, src, srcOffset, length);
        return this;
    }

    public static int CFICodeId()
    {
        return 461;
    }

    public static String CFICodeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte cFICodeNullValue()
    {
        return (byte)0;
    }

    public static byte cFICodeMinValue()
    {
        return (byte)32;
    }

    public static byte cFICodeMaxValue()
    {
        return (byte)126;
    }

    public static int cFICodeLength()
    {
        return 6;
    }

    public byte cFICode(final int index)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 65 + (index * 1));
    }

    public void cFICode(final int index, final byte value)
    {
        if (index < 0 || index >= 6)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 65 + (index * 1), value);
    }

    public static String cFICodeCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getCFICode(final byte[] dst, final int dstOffset)
    {
        final int length = 6;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 65, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putCFICode(final byte[] src, final int srcOffset)
    {
        final int length = 6;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 65, src, srcOffset, length);
        return this;
    }

    public static int MaturityMonthYearId()
    {
        return 200;
    }

    public static String MaturityMonthYearMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "MonthYear";
        }

        return "";
    }

    private final MaturityMonthYear maturityMonthYear = new MaturityMonthYear();

    public MaturityMonthYear maturityMonthYear()
    {
        maturityMonthYear.wrap(buffer, offset + 71, actingVersion);
        return maturityMonthYear;
    }

    public static int CurrencyId()
    {
        return 15;
    }

    public static String CurrencyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Currency";
        }

        return "";
    }

    public static byte currencyNullValue()
    {
        return (byte)0;
    }

    public static byte currencyMinValue()
    {
        return (byte)32;
    }

    public static byte currencyMaxValue()
    {
        return (byte)126;
    }

    public static int currencyLength()
    {
        return 3;
    }

    public byte currency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 76 + (index * 1));
    }

    public void currency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 76 + (index * 1), value);
    }

    public static String currencyCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 76, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 76, src, srcOffset, length);
        return this;
    }

    public static int SettlCurrencyId()
    {
        return 120;
    }

    public static String SettlCurrencyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Currency";
        }

        return "";
    }

    public static byte settlCurrencyNullValue()
    {
        return (byte)0;
    }

    public static byte settlCurrencyMinValue()
    {
        return (byte)32;
    }

    public static byte settlCurrencyMaxValue()
    {
        return (byte)126;
    }

    public static int settlCurrencyLength()
    {
        return 3;
    }

    public byte settlCurrency(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 79 + (index * 1));
    }

    public void settlCurrency(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 79 + (index * 1), value);
    }

    public static String settlCurrencyCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getSettlCurrency(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 79, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putSettlCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 79, src, srcOffset, length);
        return this;
    }

    public static int MatchAlgorithmId()
    {
        return 1142;
    }

    public static String MatchAlgorithmMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "char";
        }

        return "";
    }

    public static byte matchAlgorithmNullValue()
    {
        return (byte)0;
    }

    public static byte matchAlgorithmMinValue()
    {
        return (byte)32;
    }

    public static byte matchAlgorithmMaxValue()
    {
        return (byte)126;
    }

    public byte matchAlgorithm()
    {
        return CodecUtil.charGet(buffer, offset + 82);
    }

    public MDInstrumentDefinitionFuture27 matchAlgorithm(final byte value)
    {
        CodecUtil.charPut(buffer, offset + 82, value);
        return this;
    }

    public static int MinTradeVolId()
    {
        return 562;
    }

    public static String MinTradeVolMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Qty";
        }

        return "";
    }

    public static long minTradeVolNullValue()
    {
        return 4294967294L;
    }

    public static long minTradeVolMinValue()
    {
        return 0L;
    }

    public static long minTradeVolMaxValue()
    {
        return 4294967293L;
    }

    public long minTradeVol()
    {
        return CodecUtil.uint32Get(buffer, offset + 83, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 minTradeVol(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 83, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int MaxTradeVolId()
    {
        return 1140;
    }

    public static String MaxTradeVolMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Qty";
        }

        return "";
    }

    public static long maxTradeVolNullValue()
    {
        return 4294967294L;
    }

    public static long maxTradeVolMinValue()
    {
        return 0L;
    }

    public static long maxTradeVolMaxValue()
    {
        return 4294967293L;
    }

    public long maxTradeVol()
    {
        return CodecUtil.uint32Get(buffer, offset + 87, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 maxTradeVol(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 87, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int MinPriceIncrementId()
    {
        return 969;
    }

    public static String MinPriceIncrementMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICE minPriceIncrement = new PRICE();

    public PRICE minPriceIncrement()
    {
        minPriceIncrement.wrap(buffer, offset + 91, actingVersion);
        return minPriceIncrement;
    }

    public static int DisplayFactorId()
    {
        return 9787;
    }

    public static String DisplayFactorMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "float";
        }

        return "";
    }

    private final FLOAT displayFactor = new FLOAT();

    public FLOAT displayFactor()
    {
        displayFactor.wrap(buffer, offset + 99, actingVersion);
        return displayFactor;
    }

    public static int MainFractionId()
    {
        return 37702;
    }

    public static String MainFractionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short mainFractionNullValue()
    {
        return (short)255;
    }

    public static short mainFractionMinValue()
    {
        return (short)0;
    }

    public static short mainFractionMaxValue()
    {
        return (short)254;
    }

    public short mainFraction()
    {
        return CodecUtil.uint8Get(buffer, offset + 107);
    }

    public MDInstrumentDefinitionFuture27 mainFraction(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 107, value);
        return this;
    }

    public static int SubFractionId()
    {
        return 37703;
    }

    public static String SubFractionMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short subFractionNullValue()
    {
        return (short)255;
    }

    public static short subFractionMinValue()
    {
        return (short)0;
    }

    public static short subFractionMaxValue()
    {
        return (short)254;
    }

    public short subFraction()
    {
        return CodecUtil.uint8Get(buffer, offset + 108);
    }

    public MDInstrumentDefinitionFuture27 subFraction(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 108, value);
        return this;
    }

    public static int PriceDisplayFormatId()
    {
        return 9800;
    }

    public static String PriceDisplayFormatMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static short priceDisplayFormatNullValue()
    {
        return (short)255;
    }

    public static short priceDisplayFormatMinValue()
    {
        return (short)0;
    }

    public static short priceDisplayFormatMaxValue()
    {
        return (short)254;
    }

    public short priceDisplayFormat()
    {
        return CodecUtil.uint8Get(buffer, offset + 109);
    }

    public MDInstrumentDefinitionFuture27 priceDisplayFormat(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 109, value);
        return this;
    }

    public static int UnitOfMeasureId()
    {
        return 996;
    }

    public static String UnitOfMeasureMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte unitOfMeasureNullValue()
    {
        return (byte)0;
    }

    public static byte unitOfMeasureMinValue()
    {
        return (byte)32;
    }

    public static byte unitOfMeasureMaxValue()
    {
        return (byte)126;
    }

    public static int unitOfMeasureLength()
    {
        return 30;
    }

    public byte unitOfMeasure(final int index)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 110 + (index * 1));
    }

    public void unitOfMeasure(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 110 + (index * 1), value);
    }

    public static String unitOfMeasureCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getUnitOfMeasure(final byte[] dst, final int dstOffset)
    {
        final int length = 30;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 110, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionFuture27 putUnitOfMeasure(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 110, src, srcOffset, length);
        return this;
    }

    public static int UnitOfMeasureQtyId()
    {
        return 1147;
    }

    public static String UnitOfMeasureQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Qty";
        }

        return "";
    }

    private final PRICENULL unitOfMeasureQty = new PRICENULL();

    public PRICENULL unitOfMeasureQty()
    {
        unitOfMeasureQty.wrap(buffer, offset + 140, actingVersion);
        return unitOfMeasureQty;
    }

    public static int TradingReferencePriceId()
    {
        return 1150;
    }

    public static String TradingReferencePriceMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL tradingReferencePrice = new PRICENULL();

    public PRICENULL tradingReferencePrice()
    {
        tradingReferencePrice.wrap(buffer, offset + 148, actingVersion);
        return tradingReferencePrice;
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
        settlPriceType.wrap(buffer, offset + 156, actingVersion);
        return settlPriceType;
    }

    public static int OpenInterestQtyId()
    {
        return 5792;
    }

    public static String OpenInterestQtyMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static int openInterestQtyNullValue()
    {
        return 2147483647;
    }

    public static int openInterestQtyMinValue()
    {
        return -2147483647;
    }

    public static int openInterestQtyMaxValue()
    {
        return 2147483647;
    }

    public int openInterestQty()
    {
        return CodecUtil.int32Get(buffer, offset + 157, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 openInterestQty(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 157, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int ClearedVolumeId()
    {
        return 5791;
    }

    public static String ClearedVolumeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static int clearedVolumeNullValue()
    {
        return 2147483647;
    }

    public static int clearedVolumeMinValue()
    {
        return -2147483647;
    }

    public static int clearedVolumeMaxValue()
    {
        return 2147483647;
    }

    public int clearedVolume()
    {
        return CodecUtil.int32Get(buffer, offset + 161, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 clearedVolume(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 161, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        highLimitPrice.wrap(buffer, offset + 165, actingVersion);
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
        lowLimitPrice.wrap(buffer, offset + 173, actingVersion);
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
        maxPriceVariation.wrap(buffer, offset + 181, actingVersion);
        return maxPriceVariation;
    }

    public static int DecayQuantityId()
    {
        return 5818;
    }

    public static String DecayQuantityMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Qty";
        }

        return "";
    }

    public static int decayQuantityNullValue()
    {
        return 2147483647;
    }

    public static int decayQuantityMinValue()
    {
        return -2147483647;
    }

    public static int decayQuantityMaxValue()
    {
        return 2147483647;
    }

    public int decayQuantity()
    {
        return CodecUtil.int32Get(buffer, offset + 189, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 decayQuantity(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 189, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int DecayStartDateId()
    {
        return 5819;
    }

    public static String DecayStartDateMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "LocalMktDate";
        }

        return "";
    }

    public static int decayStartDateNullValue()
    {
        return 65535;
    }

    public static int decayStartDateMinValue()
    {
        return 0;
    }

    public static int decayStartDateMaxValue()
    {
        return 65534;
    }

    public int decayStartDate()
    {
        return CodecUtil.uint16Get(buffer, offset + 193, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 decayStartDate(final int value)
    {
        CodecUtil.uint16Put(buffer, offset + 193, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int OriginalContractSizeId()
    {
        return 5849;
    }

    public static String OriginalContractSizeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Qty";
        }

        return "";
    }

    public static int originalContractSizeNullValue()
    {
        return 2147483647;
    }

    public static int originalContractSizeMinValue()
    {
        return -2147483647;
    }

    public static int originalContractSizeMaxValue()
    {
        return 2147483647;
    }

    public int originalContractSize()
    {
        return CodecUtil.int32Get(buffer, offset + 195, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 originalContractSize(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 195, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int ContractMultiplierId()
    {
        return 231;
    }

    public static String ContractMultiplierMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static int contractMultiplierNullValue()
    {
        return 2147483647;
    }

    public static int contractMultiplierMinValue()
    {
        return -2147483647;
    }

    public static int contractMultiplierMaxValue()
    {
        return 2147483647;
    }

    public int contractMultiplier()
    {
        return CodecUtil.int32Get(buffer, offset + 199, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionFuture27 contractMultiplier(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 199, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public static int ContractMultiplierUnitId()
    {
        return 1435;
    }

    public static String ContractMultiplierUnitMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static byte contractMultiplierUnitNullValue()
    {
        return (byte)127;
    }

    public static byte contractMultiplierUnitMinValue()
    {
        return (byte)-127;
    }

    public static byte contractMultiplierUnitMaxValue()
    {
        return (byte)127;
    }

    public byte contractMultiplierUnit()
    {
        return CodecUtil.int8Get(buffer, offset + 203);
    }

    public MDInstrumentDefinitionFuture27 contractMultiplierUnit(final byte value)
    {
        CodecUtil.int8Put(buffer, offset + 203, value);
        return this;
    }

    public static int FlowScheduleTypeId()
    {
        return 1439;
    }

    public static String FlowScheduleTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static byte flowScheduleTypeNullValue()
    {
        return (byte)127;
    }

    public static byte flowScheduleTypeMinValue()
    {
        return (byte)-127;
    }

    public static byte flowScheduleTypeMaxValue()
    {
        return (byte)127;
    }

    public byte flowScheduleType()
    {
        return CodecUtil.int8Get(buffer, offset + 204);
    }

    public MDInstrumentDefinitionFuture27 flowScheduleType(final byte value)
    {
        CodecUtil.int8Put(buffer, offset + 204, value);
        return this;
    }

    public static int MinPriceIncrementAmountId()
    {
        return 1146;
    }

    public static String MinPriceIncrementAmountMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL minPriceIncrementAmount = new PRICENULL();

    public PRICENULL minPriceIncrementAmount()
    {
        minPriceIncrementAmount.wrap(buffer, offset + 205, actingVersion);
        return minPriceIncrementAmount;
    }

    public static int UserDefinedInstrumentId()
    {
        return 9779;
    }

    public static String UserDefinedInstrumentMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "char";
        }

        return "";
    }

    public static byte userDefinedInstrumentNullValue()
    {
        return (byte)0;
    }

    public static byte userDefinedInstrumentMinValue()
    {
        return (byte)32;
    }

    public static byte userDefinedInstrumentMaxValue()
    {
        return (byte)126;
    }

    public byte userDefinedInstrument()
    {
        if (actingVersion < 3)
        {
            return (byte)0;
        }

        return CodecUtil.charGet(buffer, offset + 213);
    }

    public MDInstrumentDefinitionFuture27 userDefinedInstrument(final byte value)
    {
        CodecUtil.charPut(buffer, offset + 213, value);
        return this;
    }

    private final NoEvents noEvents = new NoEvents();

    public static long NoEventsId()
    {
        return 864;
    }

    public NoEvents noEvents()
    {
        noEvents.wrapForDecode(parentMessage, buffer, actingVersion);
        return noEvents;
    }

    public NoEvents noEventsCount(final int count)
    {
        noEvents.wrapForEncode(parentMessage, buffer, count);
        return noEvents;
    }

    public static class NoEvents implements Iterable<NoEvents>, java.util.Iterator<NoEvents>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDInstrumentDefinitionFuture27 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)9);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 9;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 9;
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
        public java.util.Iterator<NoEvents> iterator()
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
        public NoEvents next()
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

        public static int EventTypeId()
        {
            return 865;
        }

        public static String EventTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public EventType eventType()
        {
            return EventType.get(CodecUtil.uint8Get(buffer, offset + 0));
        }

        public NoEvents eventType(final EventType value)
        {
            CodecUtil.uint8Put(buffer, offset + 0, value.value());
            return this;
        }

        public static int EventTimeId()
        {
            return 1145;
        }

        public static String EventTimeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "UTCTimestamp";
            }

            return "";
        }

        public static long eventTimeNullValue()
        {
            return 0xffffffffffffffffL;
        }

        public static long eventTimeMinValue()
        {
            return 0x0L;
        }

        public static long eventTimeMaxValue()
        {
            return 0xfffffffffffffffeL;
        }

        public long eventTime()
        {
            return CodecUtil.uint64Get(buffer, offset + 1, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoEvents eventTime(final long value)
        {
            CodecUtil.uint64Put(buffer, offset + 1, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }
    }

    private final NoMDFeedTypes noMDFeedTypes = new NoMDFeedTypes();

    public static long NoMDFeedTypesId()
    {
        return 1141;
    }

    public NoMDFeedTypes noMDFeedTypes()
    {
        noMDFeedTypes.wrapForDecode(parentMessage, buffer, actingVersion);
        return noMDFeedTypes;
    }

    public NoMDFeedTypes noMDFeedTypesCount(final int count)
    {
        noMDFeedTypes.wrapForEncode(parentMessage, buffer, count);
        return noMDFeedTypes;
    }

    public static class NoMDFeedTypes implements Iterable<NoMDFeedTypes>, java.util.Iterator<NoMDFeedTypes>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDInstrumentDefinitionFuture27 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)4);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 4;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 4;
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
        public java.util.Iterator<NoMDFeedTypes> iterator()
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
        public NoMDFeedTypes next()
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

        public static int MDFeedTypeId()
        {
            return 1022;
        }

        public static String MDFeedTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "String";
            }

            return "";
        }

        public static byte mDFeedTypeNullValue()
        {
            return (byte)0;
        }

        public static byte mDFeedTypeMinValue()
        {
            return (byte)32;
        }

        public static byte mDFeedTypeMaxValue()
        {
            return (byte)126;
        }

        public static int mDFeedTypeLength()
        {
            return 3;
        }

        public byte mDFeedType(final int index)
        {
            if (index < 0 || index >= 3)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            return CodecUtil.charGet(buffer, this.offset + 0 + (index * 1));
        }

        public void mDFeedType(final int index, final byte value)
        {
            if (index < 0 || index >= 3)
            {
                throw new IndexOutOfBoundsException("index out of range: index=" + index);
            }

            CodecUtil.charPut(buffer, this.offset + 0 + (index * 1), value);
        }

        public static String mDFeedTypeCharacterEncoding()
        {
            return "UTF-8";
        }

        public int getMDFeedType(final byte[] dst, final int dstOffset)
        {
            final int length = 3;
            if (dstOffset < 0 || dstOffset > (dst.length - length))
            {
                throw new IndexOutOfBoundsException(                    "dstOffset out of range for copy: offset=" + dstOffset);
            }

            CodecUtil.charsGet(buffer, this.offset + 0, dst, dstOffset, length);
            return length;
        }

        public NoMDFeedTypes putMDFeedType(final byte[] src, final int srcOffset)
        {
            final int length = 3;
            if (srcOffset < 0 || srcOffset > (src.length - length))
            {
                throw new IndexOutOfBoundsException(                    "srcOffset out of range for copy: offset=" + srcOffset);
            }

            CodecUtil.charsPut(buffer, this.offset + 0, src, srcOffset, length);
            return this;
        }

        public static int MarketDepthId()
        {
            return 264;
        }

        public static String MarketDepthMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static byte marketDepthNullValue()
        {
            return (byte)-128;
        }

        public static byte marketDepthMinValue()
        {
            return (byte)-127;
        }

        public static byte marketDepthMaxValue()
        {
            return (byte)127;
        }

        public byte marketDepth()
        {
            return CodecUtil.int8Get(buffer, offset + 3);
        }

        public NoMDFeedTypes marketDepth(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 3, value);
            return this;
        }
    }

    private final NoInstAttrib noInstAttrib = new NoInstAttrib();

    public static long NoInstAttribId()
    {
        return 870;
    }

    public NoInstAttrib noInstAttrib()
    {
        noInstAttrib.wrapForDecode(parentMessage, buffer, actingVersion);
        return noInstAttrib;
    }

    public NoInstAttrib noInstAttribCount(final int count)
    {
        noInstAttrib.wrapForEncode(parentMessage, buffer, count);
        return noInstAttrib;
    }

    public static class NoInstAttrib implements Iterable<NoInstAttrib>, java.util.Iterator<NoInstAttrib>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDInstrumentDefinitionFuture27 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)4);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 4;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 4;
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
        public java.util.Iterator<NoInstAttrib> iterator()
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
        public NoInstAttrib next()
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

        public static int InstAttribTypeId()
        {
            return 871;
        }

        public static String InstAttribTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static byte instAttribTypeNullValue()
        {
            return (byte)-128;
        }

        public static byte instAttribTypeMinValue()
        {
            return (byte)-127;
        }

        public static byte instAttribTypeMaxValue()
        {
            return (byte)127;
        }

        public byte instAttribType()
        {
            return (byte)24;
        }

        public static int InstAttribValueId()
        {
            return 872;
        }

        public static String InstAttribValueMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "MultipleCharValue";
            }

            return "";
        }

        private final InstAttribValue instAttribValue = new InstAttribValue();

        public InstAttribValue instAttribValue()
        {
            instAttribValue.wrap(buffer, offset + 0, actingVersion);
            return instAttribValue;
        }
    }

    private final NoLotTypeRules noLotTypeRules = new NoLotTypeRules();

    public static long NoLotTypeRulesId()
    {
        return 1234;
    }

    public NoLotTypeRules noLotTypeRules()
    {
        noLotTypeRules.wrapForDecode(parentMessage, buffer, actingVersion);
        return noLotTypeRules;
    }

    public NoLotTypeRules noLotTypeRulesCount(final int count)
    {
        noLotTypeRules.wrapForEncode(parentMessage, buffer, count);
        return noLotTypeRules;
    }

    public static class NoLotTypeRules implements Iterable<NoLotTypeRules>, java.util.Iterator<NoLotTypeRules>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDInstrumentDefinitionFuture27 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionFuture27 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)5);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 5;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 5;
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
        public java.util.Iterator<NoLotTypeRules> iterator()
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
        public NoLotTypeRules next()
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

        public static int LotTypeId()
        {
            return 1093;
        }

        public static String LotTypeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static byte lotTypeNullValue()
        {
            return (byte)-128;
        }

        public static byte lotTypeMinValue()
        {
            return (byte)-127;
        }

        public static byte lotTypeMaxValue()
        {
            return (byte)127;
        }

        public byte lotType()
        {
            return CodecUtil.int8Get(buffer, offset + 0);
        }

        public NoLotTypeRules lotType(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 0, value);
            return this;
        }

        public static int MinLotSizeId()
        {
            return 1231;
        }

        public static String MinLotSizeMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Qty";
            }

            return "";
        }

        private final DecimalQty minLotSize = new DecimalQty();

        public DecimalQty minLotSize()
        {
            minLotSize.wrap(buffer, offset + 1, actingVersion);
            return minLotSize;
        }
    }
}
