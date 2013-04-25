package au.com.sequation.sensis.model.tab;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:50 PM
 */
public class Category
{
    private final String id;
    private final String name;
    private final List<Association> associations;

    public Category(String id, String name, List<Association> associations)
    {
        this.id = id;
        this.name = name;
        this.associations = associations != null ? ImmutableList.copyOf(associations) : ImmutableList.<Association>of();
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Association> getAssociations()
    {
        return associations;
    }
}
