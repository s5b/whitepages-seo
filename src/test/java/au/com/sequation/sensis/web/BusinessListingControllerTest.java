package au.com.sequation.sensis.web;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.ui.Model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * User: sbegg
 * Date: 20/04/13
 * Time: 5:50 PM
 */
public class BusinessListingControllerTest
{
    private static final String CONTENT_ID_JETSTAR = "456";

    Model model = mock(Model.class);

    @Test
    public void testDefaultLocationForJetStar() {
        BusinessListingController blc = new BusinessListingController();
        ArgumentCaptor<Location> locationCapture = ArgumentCaptor.forClass(Location.class);

        blc.defaultView(model, "contentName", CONTENT_ID_JETSTAR);

        verify(model).addAttribute(eq("location"), locationCapture.capture());

        assertThat(blc, notNullValue());

        Location location = locationCapture.getValue();
        assertThat(location.getContentName(), equalTo("contentName"));
        assertThat(location.getContentId(), equalTo("456"));
        assertThat(location.getContactId(), equalTo(""));
        assertThat(location.getTabId(), equalTo("101"));
        assertThat(location.getCategoryId(), equalTo("100002"));
        assertThat(location.getSuburb(), equalTo(""));
        assertThat(location.getState(), equalTo(""));
    }

    @Test
    public void testGoingForALocationWithNoFindUsTabForJetStar() {
        BusinessListingController blc = new BusinessListingController();
        ArgumentCaptor<Location> locationCapture = ArgumentCaptor.forClass(Location.class);

        blc.locationView(model, "contentName", CONTENT_ID_JETSTAR, "suburb", "state");

        verify(model).addAttribute(eq("location"), locationCapture.capture());

        assertThat(blc, notNullValue());

        Location location = locationCapture.getValue();
        assertThat(location.getContentName(), equalTo("contentName"));
        assertThat(location.getContentId(), equalTo("456"));
        assertThat(location.getContactId(), equalTo(""));
        assertThat(location.getTabId(), equalTo("101"));
        assertThat(location.getCategoryId(), equalTo("100002"));
        assertThat(location.getSuburb(), equalTo("suburb"));
        assertThat(location.getState(), equalTo("state"));
    }
}
