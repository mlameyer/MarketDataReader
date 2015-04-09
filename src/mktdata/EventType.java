/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum EventType
{
    Activation((short)5),
    LastEligibleTradeDate((short)7),
    NULL_VAL((short)255);

    private final short value;

    EventType(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static EventType get(final short value)
    {
        switch (value)
        {
            case 5: return Activation;
            case 7: return LastEligibleTradeDate;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
