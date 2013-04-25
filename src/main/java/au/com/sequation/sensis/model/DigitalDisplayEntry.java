package au.com.sequation.sensis.model;

import au.com.sequation.sensis.model.tab.*;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

/**
 * User: sbegg
 * Date: 13/04/13
 * Time: 4:18 PM
 */
public class DigitalDisplayEntry
{
    private static final Predicate<Tab> ONLY_TABS_WITH_ASSOCIATIONS = new Predicate<Tab>() {
        @Override
        public boolean apply(Tab tab)
        {
            if (FindUsTab.class.isAssignableFrom(tab.getClass())) {
                List<Association> associations = ((FindUsTab) tab).getAssociations();
                return associations != null && !associations.isEmpty();
            } else if (ContactTab.class.isAssignableFrom(tab.getClass())) {
                return !((ContactTab) tab).getCategories().isEmpty();
            }
            return false; // Don't know what kind of tab it is so ignore it!
        }
    };
    private final String contentId;
    private final String name;
    private final List<Tab> tabs;
    private final Map<String, Contact> contacts;

    public DigitalDisplayEntry(String contentId, String name, Map<String, Contact> contacts, List<Tab> tabs)
    {
        this.contentId = contentId;
        this.name = name;
        this.tabs = FluentIterable.from(tabs != null ? tabs : Lists.<Tab>newArrayList()).filter(ONLY_TABS_WITH_ASSOCIATIONS).toList();
        this.contacts = ImmutableMap.copyOf(contacts);
    }

    public String getContentId()
    {
        return contentId;
    }

    public String getName()
    {
        return name;
    }

    public Map<String, Contact> getContacts()
    {
        return contacts;
    }

    public List<Tab> getTabs()
    {
        return tabs;
    }
}
