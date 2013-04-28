package au.com.sequation.sensis.web.tags;

import au.com.sequation.sensis.model.Address;
import au.com.sequation.sensis.model.tab.Association;
import au.com.sequation.sensis.web.Region;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import javax.servlet.jsp.tagext.TagSupport;
import java.util.List;

/**
 * User: sbegg
 * Date: 28/04/13
 * Time: 11:23 PM
 */
public class FilterAssociations extends TagSupport
{
    public static List<Association> getFilteredAssociations(List<Association> associations, final Region region) {
        if (region.getSuburb().length() == 0 && region.getState().length() == 0) {
            return associations;
        }
        return FluentIterable.from(associations).filter(new Predicate<Association>() {
            @Override
            public boolean apply(Association association)
            {
                Address address = association.getContact().getAddress();
                String suburb = address.getSuburb().toLowerCase().replaceAll(" ", "-");
                String state = address.getState().toLowerCase();
                return region.getSuburb().equals(suburb) && region.getState().equals(state);
            }
        }).toList();
    }
}
