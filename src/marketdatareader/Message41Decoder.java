/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marketdatareader;

import MSMQWriter.WritetoMSMQ;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import mktdata.MDInstrumentDefinitionOption41;
import mktdata.MatchEventIndicator;
import mktdata.SettlPriceType;
import uk.co.real_logic.sbe.codec.java.DirectBuffer;
/**
 *
 * @author Administrator
 */
class Message41Decoder {
    private final MDInstrumentDefinitionOption41 marketData = new MDInstrumentDefinitionOption41();
    private final WritetoMSMQ mq;
    private final String queue;
    private final byte[] message;
    private final byte[] messageCount;
    private final int bufferOffset;
    private final int actingBlockLength;
    private final int actingVersion;
    private String MEI;
    private String SPT;
    
    public Message41Decoder(byte[] message, final byte[] messageCount, int bufferOffset, int actingBlockLength, int actingVersion, final String queue) {
        this.message = message;
        this.messageCount = messageCount;
        this.bufferOffset = bufferOffset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion; 
        this.queue = queue;
        mq = new WritetoMSMQ(queue);
        decode();
    }

    private void decode() {
        final DirectBuffer directBuffer = new DirectBuffer(message);
        final ByteBuffer buffer = ByteBuffer.wrap(message);
        StringBuilder sbmd = new StringBuilder();
        buffer.order(ByteOrder.LITTLE_ENDIAN);
       
        marketData.wrapForDecode(directBuffer, bufferOffset, actingBlockLength, actingVersion);
        sbmd.append("[34]=\"").append(buffer.getInt() & 0xffffffff).append("-").append(messageCount[0]);
        sbmd.append("\"[52]=\"").append(buffer.getLong() & 0xffffffff);
        sbmd.append("\"[TEMPID]=\"").append(marketData.sbeTemplateId());
        sbmd.append("\"[35]=\"").append(marketData.sbeSemanticType());
        
        sbmd.append("\"[5799]=\"");
        final MatchEventIndicator event = marketData.matchEventIndicator();
        if(event.EndOfEvent()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastQuoteMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.LastImpliedMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastStatsMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.LastTradeMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.LastVolumeMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        if(event.RecoveryMsg()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI); 
        if(event.Reserved()){MEI = "1";}else{MEI = "0";}
        sbmd.append(MEI);
        
        sbmd.append("\"[911]=\"").append(marketData.totNumReports());
        sbmd.append("\"[980]=\"").append(marketData.securityUpdateAction());
        sbmd.append("\"[779]=\"").append(marketData.lastUpdateTime());
        sbmd.append("\"[1682]=\"").append(marketData.mDSecurityTradingStatus());
        sbmd.append("\"[1180]=\"").append(marketData.applID());
        sbmd.append("\"[1300]=\"").append(marketData.marketSegmentID());
        sbmd.append("\"[462]=\"").append(marketData.underlyingProduct());
        try {
            sbmd.append("\"[207]=\"").append(new String(message, 0, marketData.getSecurityExchange(message, 0),MDInstrumentDefinitionOption41.securityExchangeCharacterEncoding()));
            sbmd.append("\"[1151]=\"").append(new String(message, 0, marketData.getSecurityGroup(message, 0),MDInstrumentDefinitionOption41.securityGroupCharacterEncoding()));
            sbmd.append("\"[6937]=\"").append(new String(message, 0, marketData.getAsset(message, 0),MDInstrumentDefinitionOption41.assetCharacterEncoding()));
            sbmd.append("\"[55]=\"").append(new String(message, 0, marketData.getSymbol(message, 0),MDInstrumentDefinitionOption41.symbolCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message41Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        sbmd.append("\"[48]=\"").append(marketData.securityID()); 
        try {
            sbmd.append("\"[22]=\"").append(new String(message, 0, marketData.getSecurityIDSource(message, 0, message.length)));
            sbmd.append("\"[167]=\"").append(new String(message, 0, marketData.getSecurityType(message, 0),MDInstrumentDefinitionOption41.securityTypeCharacterEncoding()));
            sbmd.append("\"[461]=\"").append(new String(message, 0, marketData.getCFICode(message, 0), MDInstrumentDefinitionOption41.cFICodeCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message41Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        sbmd.append("\"[201]=\"").append(marketData.putOrCall());
        sbmd.append("\"[200]=\"").append(marketData.maturityMonthYear());
        try {
            sbmd.append("\"[15]=\"").append(new String(message, 0, marketData.getCurrency(message, 0), MDInstrumentDefinitionOption41.currencyCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
        sbmd.append("\"[202]=\"").append(marketData.strikePrice());
        try {
            sbmd.append("\"[947]=\"").append(new String(message, 0, marketData.getStrikeCurrency(message, 0), MDInstrumentDefinitionOption41.strikeCurrencyCharacterEncoding()));
            sbmd.append("\"[120]=\"").append(new String(message, 0, marketData.getSettlCurrency(message, 0), MDInstrumentDefinitionOption41.settlCurrencyCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
        sbmd.append("\"[9850]=\"").append(marketData.minCabPrice());
        sbmd.append("\"[1142]=\"").append(marketData.matchAlgorithm());
        sbmd.append("\"[562]=\"").append(marketData.minTradeVol());
        sbmd.append("\"[1140]=\"").append(marketData.maxTradeVol());
        sbmd.append("\"[969]=\"").append(marketData.minPriceIncrement());
        sbmd.append("\"[1146]=\"").append(marketData.minPriceIncrementAmount());
        sbmd.append("\"[9787]=\"").append(marketData.displayFactor());
        sbmd.append("\"[6350]=\"").append(marketData.tickRule());
        sbmd.append("\"[37702]=\"").append(marketData.mainFraction());
        sbmd.append("\"[37703]=\"").append(marketData.subFraction());
        sbmd.append("\"[9800]=\"").append(marketData.priceDisplayFormat());
        
        try {
            sbmd.append("\"[996]=\"").append(new String(message, 0, marketData.getUnitOfMeasure(message, 0),MDInstrumentDefinitionOption41.unitOfMeasureCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
        sbmd.append("\"[1147]=\"").append(marketData.unitOfMeasureQty());
        sbmd.append("\"[1150]=\"").append(marketData.tradingReferencePrice());
       
        sbmd.append("\"[731]=\"");
        final SettlPriceType event1 = marketData.settlPriceType();
        if(event1.Actual()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT); 
        if(event1.Final()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT);
        if(event1.Intraday()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT); 
        if(event1.NullValue()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT);
        if(event1.ReservedBits()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT); 
        if(event1.Rounded()){SPT = "1";}else{SPT = "0";}
        sbmd.append(SPT);   

        sbmd.append("\"[5791]=\"").append(marketData.clearedVolume());
        sbmd.append("\"[5792]=\"").append(marketData.openInterestQty());
        sbmd.append("\"[1148]=\"").append(marketData.lowLimitPrice());
        sbmd.append("\"[1149]=\"").append(marketData.highLimitPrice());
        sbmd.append("\"[9779]=\"").append(marketData.userDefinedInstrument());
        sbmd.append("\"%");
        
        for(final MDInstrumentDefinitionOption41.NoEvents noEvents : marketData.noEvents())
        {
            sbmd.append("\"[865]=\"").append(noEvents.eventType());          
            sbmd.append("\"[1145]=\"").append(noEvents.eventTime());  
            sbmd.append("\"?");
        }
       
        for(final MDInstrumentDefinitionOption41.NoMDFeedTypes noMDFeedTypes : marketData.noMDFeedTypes())
        {
            try {          
                sbmd.append("\"[1022]=\"").append(new String(message, 0, noMDFeedTypes.getMDFeedType(message, 0),MDInstrumentDefinitionOption41.NoMDFeedTypes.mDFeedTypeCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
            sbmd.append("\"[264]=\"").append(noMDFeedTypes.marketDepth());
            sbmd.append("\"?");
        }
       
        for(final MDInstrumentDefinitionOption41.NoInstAttrib noInstAttrib : marketData.noInstAttrib())
        {
            sbmd.append("\"[871]=\"").append(noInstAttrib.instAttribType());          
            sbmd.append("\"[872]=\"").append(noInstAttrib.instAttribValue());
            sbmd.append("\"?");
        }
       
        for(final MDInstrumentDefinitionOption41.NoLotTypeRules noLotTypeRules : marketData.noLotTypeRules())
        {
            sbmd.append("\"[1093]=\"").append(noLotTypeRules.lotType());          
            sbmd.append("\"[1231]=\"").append(noLotTypeRules.minLotSize()); 
            sbmd.append("\"?");
        }
        
        for(final MDInstrumentDefinitionOption41.NoUnderlyings noUnderlyings : marketData.noUnderlyings())
        {
            sbmd.append("\"[309]=\"").append(noUnderlyings.underlyingSecurityID());         
            sbmd.append("\"[305]=\"").append(noUnderlyings.getUnderlyingSecurityIDSource(message, 0, message.length));  
            try {          
                sbmd.append("\"[311]=\"").append(new String(message, 0, noUnderlyings.getUnderlyingSymbol(message, 0),MDInstrumentDefinitionOption41.NoUnderlyings.underlyingSymbolCharacterEncoding()));
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Message27Decoder.class.getName()).log(Level.SEVERE, null, ex);
            }
            sbmd.append("\"?");
        }
       
        sbmd.append("\"\"");
               
        System.out.println(sbmd);
        mq.write(sbmd.toString());
    }
    
}
