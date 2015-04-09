/* Generated SBE (Simple Binary Encoding) message codec */
package mktdata;

public enum MDUpdateAction
{
    New((short)0),
    Change((short)1),
    Delete((short)2),
    DeleteThru((short)3),
    DeleteFrom((short)4),
    Overlay((short)5),
    NULL_VAL((short)255);

    private final short value;

    MDUpdateAction(final short value)
    {
        this.value = value;
    }

    public short value()
    {
        return value;
    }

    public static MDUpdateAction get(final short value)
    {
        switch (value)
        {
            case 0: return New;
            case 1: return Change;
            case 2: return Delete;
            case 3: return DeleteThru;
            case 4: return DeleteFrom;
            case 5: return Overlay;
        }

        if ((short)255 == value)
        {
            return NULL_VAL;
        }

        throw new IllegalArgumentException("Unknown value: " + value);
    }
}
