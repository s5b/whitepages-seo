package au.com.sequation.sensis.model;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:24 PM
 */
public class Telecom
{
    private final String id;
    private final TelecomType type;
    private final String number;

    public Telecom(String id, TelecomType type, String number)
    {
        this.id = id;
        this.type = type;
        this.number = number;
    }

    public TelecomType getType()
    {
        return type;
    }

    public String getNumber()
    {
        return number;
    }
}
