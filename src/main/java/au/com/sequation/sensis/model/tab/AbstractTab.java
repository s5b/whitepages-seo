package au.com.sequation.sensis.model.tab;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:43 PM
 */
public abstract class AbstractTab implements Tab
{
    private final String id;
    private final String name;

    public AbstractTab(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public abstract String getType();
}
