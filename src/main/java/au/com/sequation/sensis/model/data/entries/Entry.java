package au.com.sequation.sensis.model.data.entries;

import au.com.sequation.sensis.model.Address;
import au.com.sequation.sensis.model.Contact;
import au.com.sequation.sensis.model.tab.Association;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * User: sbegg
 * Date: 19/04/13
 * Time: 4:10 PM
 */
public abstract class Entry
{

    List<Association> filterOnlyAddressedContacts(Collection<Contact> allContacts)
    {
        return FluentIterable.from(allContacts).filter(
                new Predicate<Contact>()
                {
                    @Override
                    public boolean apply(Contact contact)
                    {
                        if (contact == null || contact.getAddress() == null)
                        {
                            return false;
                        }
                        else
                        {
                            Address address = contact.getAddress();
                            return address.getGeocode() != null ||
                                    address.getLabel().length() != 0 ||
                                    address.getNumber().length() != 0 ||
                                    address.getStreet().length() != 0 ||
                                    address.getSuburb().length() != 0 ||
                                    address.getState().length() != 0 ||
                                    address.getPostcode().length() != 0;
                        }
                    }
                }
        ).transform(new Function<Contact, Association>()
        {
            @Override
            public Association apply(Contact contact)
            {
                return new Association(contact);
            }
        }).toSortedList(new Comparator<Association>()
        {
            @Override
            public int compare(Association associationFirst, Association associationSecond)
            {
                String stateFirst = associationFirst.getContact().getAddress().getState();
                String stateSecond = associationSecond.getContact().getAddress().getState();
                int stateComparison = stateFirst.compareTo(stateSecond);
                if (stateComparison != 0) {
                    return stateComparison;
                }
                String suburbFirst = associationFirst.getContact().getAddress().getSuburb();
                String suburbSecond = associationSecond.getContact().getAddress().getSuburb();
                return suburbFirst.compareTo(suburbSecond);
            }
        });
    }
}
