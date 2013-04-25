package au.com.sequation.sensis.model.tab;

import au.com.sequation.sensis.model.Address;
import au.com.sequation.sensis.model.Contact;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;

import java.util.Collection;
import java.util.Comparator;
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
}
