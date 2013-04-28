package au.com.sequation.sensis.web.tags;

import au.com.sequation.sensis.model.tab.Association;
import au.com.sequation.sensis.web.Region;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * User: sbegg
 * Date: 28/04/13
 * Time: 11:23 PM
 */
public class FilterAssociations
{
    public static List<Association> getFilteredAssociations(List<Association> associations, Region region) {
        return ImmutableList.copyOf(associations);
    }
}
