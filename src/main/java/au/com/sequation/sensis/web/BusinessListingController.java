package au.com.sequation.sensis.web;

import au.com.sequation.sensis.model.DigitalDisplayEntry;
import au.com.sequation.sensis.model.data.AllDigitalDisplays;
import au.com.sequation.sensis.model.tab.Category;
import au.com.sequation.sensis.model.tab.ContactTab;
import au.com.sequation.sensis.model.tab.FindUsTab;
import au.com.sequation.sensis.model.tab.Tab;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/business-listing/*")
public class BusinessListingController
{
    private static final AllDigitalDisplays ALL_DIGITAL_DISPLAY_ENTRIES = AllDigitalDisplays.allDigitalDisplays();

    private static final String LOCATION_NO_CATEGORY = "";
    private static final String LOCATION_NO_SUBURB = "";
    private static final String LOCATION_NO_STATE = "";
    private static final String LOCATION_NO_CONTACT_ID = "";

	@RequestMapping(value="{contentName}-{contentId}", method=RequestMethod.GET)
	public String defaultView(Model model,
                              @PathVariable String contentName, @PathVariable String contentId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation tabLocation = getDefaultTabCategory(dde);
        model.addAttribute("location", new Location(contentName, contentId,
                tabLocation.getTabId(), tabLocation.getCategoryId(),
                LOCATION_NO_SUBURB, LOCATION_NO_STATE,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
	}

	@RequestMapping(value="{contentName}-{contentId}/{suburb}-{state}", method=RequestMethod.GET)
	public String locationView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation tabLocation = resolveFindUsTab(dde, getDefaultTabCategory(dde));
        model.addAttribute("location", new Location(contentName, contentId,
                tabLocation.getTabId(), tabLocation.getCategoryId(),
                suburb, state,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
	}

	@RequestMapping(value="{contentName}-{contentId}/tab/{tabId}", method=RequestMethod.GET)
	public String tabView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String tabId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation tabLocation = resolveTabCategory(dde, tabId, LOCATION_NO_CATEGORY, getDefaultTabCategory(dde));
        model.addAttribute("location", new Location(contentName, contentId,
                tabLocation.getTabId(), tabLocation.getCategoryId(),
                LOCATION_NO_SUBURB, LOCATION_NO_STATE,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
    }

	@RequestMapping(value="{contentName}-{contentId}/tab/{tabId}/category/{categoryId}", method=RequestMethod.GET)
	public String tabCategoryView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String tabId, @PathVariable String categoryId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation tabLocation = resolveTabCategory(dde, tabId, categoryId, getDefaultTabCategory(dde));
        model.addAttribute("location", new Location(contentName, contentId,
                tabLocation.getTabId(), tabLocation.getCategoryId(),
                LOCATION_NO_SUBURB, LOCATION_NO_STATE,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
    }

	@RequestMapping(value="{contentName}-{contentId}/contact/{contactId}", method=RequestMethod.GET)
	public String tabContactMapView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String contactId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation tabLocation = resolveFindUsTab(dde, getDefaultTabCategory(dde));
        model.addAttribute("location", new Location(contentName, contentId,
                tabLocation.getTabId(), tabLocation.getCategoryId(),
                LOCATION_NO_SUBURB, LOCATION_NO_STATE,
                contactId));

        return render(dde, model);
    }

    /* *** private *** */

    private TabLocation resolveFindUsTab(DigitalDisplayEntry dde, TabLocation defaultTabLocation) {
        Tab tab = FluentIterable.from(dde.getTabs()).firstMatch(new Predicate<Tab>()
        {
            @Override
            public boolean apply(Tab tab)
            {
                return FindUsTab.class.isAssignableFrom(tab.getClass());
            }
        }).orNull();
        return tab != null ? new TabLocation(tab.getId(), LOCATION_NO_CATEGORY) : defaultTabLocation;
    }

    private TabLocation getDefaultTabCategory(DigitalDisplayEntry dde) {
        ContactTab firstTab = (ContactTab) dde.getTabs().get(0);
        return new TabLocation(firstTab.getId(), firstTab.getCategories().get(0).getId());
    }

    private Tab findTabById(List<Tab> tabs, final String tabId) {
        return FluentIterable.from(tabs).firstMatch(new Predicate<Tab>()
        {
            @Override
            public boolean apply(Tab tab)
            {
                return tab.getId().equals(tabId);
            }
        }).orNull();
    }

    private Category findCategoryById(List<Category> categories, final String categoryId) {
        return FluentIterable.from(categories).firstMatch(new Predicate<Category>()
        {
            @Override
            public boolean apply(Category category)
            {
                return category.getId().equals(categoryId);
            }
        }).orNull();
    }

    private TabLocation resolveTabCategory(DigitalDisplayEntry dde,
                                           String tabId, String categoryId,
                                           TabLocation defaultTabLocation) {
        Tab tab = findTabById(dde.getTabs(), tabId);
        if (tab != null) {
            if (FindUsTab.class.isAssignableFrom(tab.getClass())) {
                return new TabLocation(tab.getId(), LOCATION_NO_CATEGORY);
            }
            if (ContactTab.class.isAssignableFrom(tab.getClass())) {
                Category category = findCategoryById(((ContactTab) tab).getCategories(), categoryId);
                return new TabLocation(tab.getId(), category != null ? category.getId() : ((ContactTab) tab).getCategories().get(0).getId());
            }
        }
        return defaultTabLocation;
    }

    private String render(DigitalDisplayEntry dde, Model model) {
        model.addAttribute("dde", dde);
        return "views/businessListing";
    }

}
