package au.com.sequation.sensis.model.data.entries;


import au.com.sequation.sensis.model.DigitalDisplayEntry;
import au.com.sequation.sensis.model.tab.ContactTab;
import au.com.sequation.sensis.model.tab.Tab;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import org.junit.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.hasItems;

/**
 * User: sbegg
 * Date: 20/04/13
 * Time: 7:10 AM
 */
public class EntryJetstarTest
{
    @Test
    public void shouldCreateJetstarDigitalDisplay() {
        DigitalDisplayEntry dde = EntryJetstar.build();
        assertThat(dde, notNullValue());
    }

    @Test
    public void shouldCreateJetstarDigitalDisplayWithoutFindUSTabBecauseThereAreNoAddresses() {
        DigitalDisplayEntry dde = EntryJetstar.build();
        assertThat(FluentIterable.from(dde.getTabs()).transform(new Function<Tab, String>() {
            @Override
            public String apply(Tab tab)
            {
                return tab.getClass().getName();
            }
        }).toSet(), hasItems(ContactTab.class.getName()));
    }
}
