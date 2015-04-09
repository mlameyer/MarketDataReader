/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

import uk.co.real_logic.sbe.codec.java.*;

public class MDInstrumentDefinitionSpread29
{
    public static final int BLOCK_LENGTH = 193;
    public static final int TEMPLATE_ID = 29;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 5;

    private final MDInstrumentDefinitionSpread29 parentMessage = this;
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

    public MDInstrumentDefinitionSpread29 wrapForEncode(final DirectBuffer buffer, final int offset)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.actingBlockLength = BLOCK_LENGTH;
        this.actingVersion = SCHEMA_VERSION;
        limit(offset + actingBlockLength);

        return this;
    }

    public MDInstrumentDefinitionSpread29 wrapForDecode(
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

    public MDInstrumentDefinitionSpread29 totNumReports(final long value)
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

    public MDInstrumentDefinitionSpread29 securityUpdateAction(final SecurityUpdateAction value)
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

    public MDInstrumentDefinitionSpread29 lastUpdateTime(final long value)
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

    public MDInstrumentDefinitionSpread29 mDSecurityTradingStatus(final SecurityTradingStatus value)
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

    public MDInstrumentDefinitionSpread29 applID(final short value)
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

    public MDInstrumentDefinitionSpread29 marketSegmentID(final short value)
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

    public MDInstrumentDefinitionSpread29 underlyingProduct(final short value)
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

    public MDInstrumentDefinitionSpread29 putSecurityExchange(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 putSecurityGroup(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 putAsset(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 putSymbol(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 securityID(final int value)
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

    public MDInstrumentDefinitionSpread29 putSecurityType(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 putCFICode(final byte[] src, final int srcOffset)
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

    public MDInstrumentDefinitionSpread29 putCurrency(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 76, src, srcOffset, length);
        return this;
    }

    public static int SecuritySubTypeId()
    {
        return 762;
    }

    public static String SecuritySubTypeMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "String";
        }

        return "";
    }

    public static byte securitySubTypeNullValue()
    {
        return (byte)0;
    }

    public static byte securitySubTypeMinValue()
    {
        return (byte)32;
    }

    public static byte securitySubTypeMaxValue()
    {
        return (byte)126;
    }

    public static int securitySubTypeLength()
    {
        return 5;
    }

    public byte securitySubType(final int index)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        return CodecUtil.charGet(buffer, this.offset + 79 + (index * 1));
    }

    public void securitySubType(final int index, final byte value)
    {
        if (index < 0 || index >= 5)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 79 + (index * 1), value);
    }

    public static String securitySubTypeCharacterEncoding()
    {
        return "UTF-8";
    }

    public int getSecuritySubType(final byte[] dst, final int dstOffset)
    {
        final int length = 5;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException(                "dstOffset out of range for copy: offset=" + dstOffset);
        }

        CodecUtil.charsGet(buffer, this.offset + 79, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionSpread29 putSecuritySubType(final byte[] src, final int srcOffset)
    {
        final int length = 5;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 79, src, srcOffset, length);
        return this;
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
        return CodecUtil.charGet(buffer, offset + 84);
    }

    public MDInstrumentDefinitionSpread29 userDefinedInstrument(final byte value)
    {
        CodecUtil.charPut(buffer, offset + 84, value);
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
        return CodecUtil.charGet(buffer, offset + 85);
    }

    public MDInstrumentDefinitionSpread29 matchAlgorithm(final byte value)
    {
        CodecUtil.charPut(buffer, offset + 85, value);
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
        return CodecUtil.uint32Get(buffer, offset + 86, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionSpread29 minTradeVol(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 86, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        return CodecUtil.uint32Get(buffer, offset + 90, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionSpread29 maxTradeVol(final long value)
    {
        CodecUtil.uint32Put(buffer, offset + 90, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        minPriceIncrement.wrap(buffer, offset + 94, actingVersion);
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
        displayFactor.wrap(buffer, offset + 102, actingVersion);
        return displayFactor;
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
        return CodecUtil.uint8Get(buffer, offset + 110);
    }

    public MDInstrumentDefinitionSpread29 priceDisplayFormat(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 110, value);
        return this;
    }

    public static int PriceRatioId()
    {
        return 5770;
    }

    public static String PriceRatioMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "Price";
        }

        return "";
    }

    private final PRICENULL priceRatio = new PRICENULL();

    public PRICENULL priceRatio()
    {
        priceRatio.wrap(buffer, offset + 111, actingVersion);
        return priceRatio;
    }

    public static int TickRuleId()
    {
        return 6350;
    }

    public static String TickRuleMetaAttribute(final MetaAttribute metaAttribute)
    {
        switch (metaAttribute)
        {
            case EPOCH: return "unix";
            case TIME_UNIT: return "nanosecond";
            case SEMANTIC_TYPE: return "int";
        }

        return "";
    }

    public static byte tickRuleNullValue()
    {
        return (byte)127;
    }

    public static byte tickRuleMinValue()
    {
        return (byte)-127;
    }

    public static byte tickRuleMaxValue()
    {
        return (byte)127;
    }

    public byte tickRule()
    {
        return CodecUtil.int8Get(buffer, offset + 119);
    }

    public MDInstrumentDefinitionSpread29 tickRule(final byte value)
    {
        CodecUtil.int8Put(buffer, offset + 119, value);
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

        return CodecUtil.charGet(buffer, this.offset + 120 + (index * 1));
    }

    public void unitOfMeasure(final int index, final byte value)
    {
        if (index < 0 || index >= 30)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        CodecUtil.charPut(buffer, this.offset + 120 + (index * 1), value);
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

        CodecUtil.charsGet(buffer, this.offset + 120, dst, dstOffset, length);
        return length;
    }

    public MDInstrumentDefinitionSpread29 putUnitOfMeasure(final byte[] src, final int srcOffset)
    {
        final int length = 30;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException(                "srcOffset out of range for copy: offset=" + srcOffset);
        }

        CodecUtil.charsPut(buffer, this.offset + 120, src, srcOffset, length);
        return this;
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
        tradingReferencePrice.wrap(buffer, offset + 150, actingVersion);
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
        settlPriceType.wrap(buffer, offset + 158, actingVersion);
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
            case SEMANTIC_TYPE: return "Qty";
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
        return CodecUtil.int32Get(buffer, offset + 159, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionSpread29 openInterestQty(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 159, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
            case SEMANTIC_TYPE: return "Qty";
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
        return CodecUtil.int32Get(buffer, offset + 163, java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public MDInstrumentDefinitionSpread29 clearedVolume(final int value)
    {
        CodecUtil.int32Put(buffer, offset + 163, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        highLimitPrice.wrap(buffer, offset + 167, actingVersion);
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
        lowLimitPrice.wrap(buffer, offset + 175, actingVersion);
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
        maxPriceVariation.wrap(buffer, offset + 183, actingVersion);
        return maxPriceVariation;
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
        return CodecUtil.uint8Get(buffer, offset + 191);
    }

    public MDInstrumentDefinitionSpread29 mainFraction(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 191, value);
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
        return CodecUtil.uint8Get(buffer, offset + 192);
    }

    public MDInstrumentDefinitionSpread29 subFraction(final short value)
    {
        CodecUtil.uint8Put(buffer, offset + 192, value);
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
        private MDInstrumentDefinitionSpread29 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int count)
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
        private MDInstrumentDefinitionSpread29 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int count)
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
        private MDInstrumentDefinitionSpread29 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int count)
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
        private MDInstrumentDefinitionSpread29 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int count)
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

    private final NoLegs noLegs = new NoLegs();

    public static long NoLegsId()
    {
        return 555;
    }

    public NoLegs noLegs()
    {
        noLegs.wrapForDecode(parentMessage, buffer, actingVersion);
        return noLegs;
    }

    public NoLegs noLegsCount(final int count)
    {
        noLegs.wrapForEncode(parentMessage, buffer, count);
        return noLegs;
    }

    public static class NoLegs implements Iterable<NoLegs>, java.util.Iterator<NoLegs>
    {
        private static final int HEADER_SIZE = 3;
        private final GroupSize dimensions = new GroupSize();
        private MDInstrumentDefinitionSpread29 parentMessage;
        private DirectBuffer buffer;
        private int blockLength;
        private int actingVersion;
        private int count;
        private int index;
        private int offset;

        public void wrapForDecode(
            final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int actingVersion)
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

        public void wrapForEncode(final MDInstrumentDefinitionSpread29 parentMessage, final DirectBuffer buffer, final int count)
        {
            this.parentMessage = parentMessage;
            this.buffer = buffer;
            actingVersion = SCHEMA_VERSION;
            dimensions.wrap(buffer, parentMessage.limit(), actingVersion);
            dimensions.blockLength((int)18);
            dimensions.numInGroup((short)count);
            index = -1;
            this.count = count;
            blockLength = 18;
            parentMessage.limit(parentMessage.limit() + HEADER_SIZE);
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 18;
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
        public java.util.Iterator<NoLegs> iterator()
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
        public NoLegs next()
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

        public static int LegSecurityIDId()
        {
            return 602;
        }

        public static String LegSecurityIDMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public static int legSecurityIDNullValue()
        {
            return -2147483648;
        }

        public static int legSecurityIDMinValue()
        {
            return -2147483647;
        }

        public static int legSecurityIDMaxValue()
        {
            return 2147483647;
        }

        public int legSecurityID()
        {
            return CodecUtil.int32Get(buffer, offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public NoLegs legSecurityID(final int value)
        {
            CodecUtil.int32Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

        public static int LegSecurityIDSourceId()
        {
            return 603;
        }

        public static String LegSecurityIDSourceMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "char";
            }

            return "";
        }

        public static byte legSecurityIDSourceNullValue()
        {
            return (byte)0;
        }

        public static byte legSecurityIDSourceMinValue()
        {
            return (byte)32;
        }

        public static byte legSecurityIDSourceMaxValue()
        {
            return (byte)126;
        }

        private static final byte[] legSecurityIDSourceValue = {56};

        public static int legSecurityIDSourceLength()
        {
            return 1;
        }

        public byte legSecurityIDSource(final int index)
        {
            return legSecurityIDSourceValue[index];
        }

        public int getLegSecurityIDSource(final byte[] dst, final int offset, final int length)
        {
            final int bytesCopied = Math.min(length, 1);
            System.arraycopy(legSecurityIDSourceValue, 0, dst, offset, bytesCopied);
            return bytesCopied;
        }

        public static int LegSideId()
        {
            return 624;
        }

        public static String LegSideMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "int";
            }

            return "";
        }

        public LegSide legSide()
        {
            return LegSide.get(CodecUtil.uint8Get(buffer, offset + 4));
        }

        public NoLegs legSide(final LegSide value)
        {
            CodecUtil.uint8Put(buffer, offset + 4, value.value());
            return this;
        }

        public static int LegRatioQtyId()
        {
            return 623;
        }

        public static String LegRatioQtyMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Qty";
            }

            return "";
        }

        public static byte legRatioQtyNullValue()
        {
            return (byte)-128;
        }

        public static byte legRatioQtyMinValue()
        {
            return (byte)-127;
        }

        public static byte legRatioQtyMaxValue()
        {
            return (byte)127;
        }

        public byte legRatioQty()
        {
            return CodecUtil.int8Get(buffer, offset + 5);
        }

        public NoLegs legRatioQty(final byte value)
        {
            CodecUtil.int8Put(buffer, offset + 5, value);
            return this;
        }

        public static int LegPriceId()
        {
            return 566;
        }

        public static String LegPriceMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Price";
            }

            return "";
        }

        private final PRICENULL legPrice = new PRICENULL();

        public PRICENULL legPrice()
        {
            legPrice.wrap(buffer, offset + 6, actingVersion);
            return legPrice;
        }

        public static int LegOptionDeltaId()
        {
            return 1017;
        }

        public static String LegOptionDeltaMetaAttribute(final MetaAttribute metaAttribute)
        {
            switch (metaAttribute)
            {
                case EPOCH: return "unix";
                case TIME_UNIT: return "nanosecond";
                case SEMANTIC_TYPE: return "Qty";
            }

            return "";
        }

        private final DecimalQty legOptionDelta = new DecimalQty();

        public DecimalQty legOptionDelta()
        {
            legOptionDelta.wrap(buffer, offset + 14, actingVersion);
            return legOptionDelta;
        }
    }
}
