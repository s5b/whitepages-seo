package au.com.sequation.sensis.model.tab;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:48 PM
 */
public class FindUsTab extends AbstractTab
{
    private final List<Association> associations;

    public FindUsTab(String id, String name, List<Association> associations)
    {
        super(id, name);
        this.associations = associations != null ? ImmutableList.copyOf(associations) : ImmutableList.<Association>of();
    }

    public List<Association> getAssociations()
    {
        return associations;
    }

    @Override
    public String getType()
    {
        return "findUs";
    }

    @Override
    public List<Category> getCategories()
    {
        return ImmutableList.of();
    }
}
