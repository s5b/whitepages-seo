package au.com.sequation.sensis.web;

import au.com.sequation.sensis.model.DigitalDisplayEntry;
import au.com.sequation.sensis.model.data.AllDigitalDisplays;
import au.com.sequation.sensis.model.tab.Category;
import au.com.sequation.sensis.model.tab.ContactTab;
import au.com.sequation.sensis.model.tab.FindUsTab;
import au.com.sequation.sensis.model.tab.Tab;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* This controller uses hash URLs to determine what should be shown. */

@Controller
@RequestMapping("/business-listing/*")
public class BusinessListingController
{
    private static final AllDigitalDisplays ALL_DIGITAL_DISPLAY_ENTRIES = AllDigitalDisplays.allDigitalDisplays();

    private static final String BASE_URL_PREFIX = "/business-listing/";

    private static final String LOCATION_NO_CATEGORY = "";
    private static final String LOCATION_NO_SUBURB = "";
    private static final String LOCATION_NO_STATE = "";
    private static final String LOCATION_NO_CONTACT_ID = "";

	@RequestMapping(value="{contentName}-{contentId}", method=RequestMethod.GET)
	public String defaultView(Model model,
                              @PathVariable String contentName, @PathVariable String contentId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);
        if (dde == null) {
            return renderNotFoundMessage(model, contentName, contentId);
        }

        TabLocation tabLocation = getDefaultTabCategory(dde);
        Region region = new Region(LOCATION_NO_SUBURB, LOCATION_NO_STATE, false, 0);
        model.addAttribute("location", new Location(new PrimaryId(BASE_URL_PREFIX, contentName, contentId, region),
                tabLocation,
                tabLocation,
                resolveFindUsTabLocation(dde).getTabId(),
                region,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
	}

    @RequestMapping(value="{contentName}-{contentId}/{suburb}-{state}", method=RequestMethod.GET)
	public String locationView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);
        if (dde == null) {
            return renderNotFoundMessage(model, contentName, contentId);
        }

        TabLocation defaultTabCategory = getDefaultTabCategory(dde);
        TabLocation tabLocation = resolveFindUsTabLocation(dde);
        Region region = new Region(suburb, state, false, 0);
        model.addAttribute("location", new Location(new PrimaryId(BASE_URL_PREFIX, contentName, contentId, region),
                tabLocation,
                defaultTabCategory,
                tabLocation.getTabId(),
                region,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
	}

    @RequestMapping(value="{contentName}-{contentId}/near/{suburb}-{state}", method=RequestMethod.GET)
	public String nearLocationView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);
        if (dde == null) {
            return renderNotFoundMessage(model, contentName, contentId);
        }

        TabLocation defaultTabCategory = getDefaultTabCategory(dde);
        TabLocation tabLocation = resolveFindUsTabLocation(dde);
        Region region = new Region(suburb, state, true, 17);
        model.addAttribute("location", new Location(new PrimaryId(BASE_URL_PREFIX, contentName, contentId, region),
                tabLocation,
                defaultTabCategory,
                tabLocation.getTabId(),
                region,
                LOCATION_NO_CONTACT_ID));

        return render(dde, model);
	}

    /* *** AJAX fragment end-points */

	@RequestMapping(value="{contentName}-{contentId}/fragment/tab/{tabId}/category/{categoryId}", method=RequestMethod.GET)
	public String fragmentTabCategoryView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String tabId, @PathVariable String categoryId) {
        return fragmentCategory(model, contentName, contentId, new Region(LOCATION_NO_SUBURB, LOCATION_NO_STATE, false, 0), tabId, categoryId);
	}

	@RequestMapping(value="{contentName}-{contentId}/{suburb}-{state}/fragment/tab/{tabId}/category/{categoryId}", method=RequestMethod.GET)
	public String fragmentRegionTabCategoryView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state,
                               @PathVariable String tabId, @PathVariable String categoryId) {
        return fragmentCategory(model, contentName, contentId, new Region(suburb, state, false, 0), tabId, categoryId);
	}

	@RequestMapping(value="{contentName}-{contentId}/near/{suburb}-{state}/fragment/tab/{tabId}/category/{categoryId}", method=RequestMethod.GET)
	public String fragmentNearRegionTabCategoryView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state,
                               @PathVariable String tabId, @PathVariable String categoryId) {
        return fragmentCategory(model, contentName, contentId, new Region(suburb, state, true, 0), tabId, categoryId);
	}

	@RequestMapping(value="{contentName}-{contentId}/fragment/tab/{tabId}", method=RequestMethod.GET)
	public String fragmentFindUsView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String tabId) {
        // FIXME: Should really check that the tabId is for the 'Find Us' tab.
        return fragmentFindUs(model, contentId);
	}

	@RequestMapping(value="{contentName}-{contentId}/{suburb}-{state}/fragment/tab/{tabId}", method=RequestMethod.GET)
	public String fragmentRegionFindUsView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state,
                               @PathVariable String tabId) {
        // FIXME: Should really check that the tabId is for the 'Find Us' tab.
        return fragmentFindUs(model, contentId);
	}

	@RequestMapping(value="{contentName}-{contentId}/near/{suburb}-{state}/fragment/tab/{tabId}", method=RequestMethod.GET)
	public String fragmentNearRegionFindUsView(Model model,
                               @PathVariable String contentName, @PathVariable String contentId,
                               @PathVariable String suburb, @PathVariable String state,
                               @PathVariable String tabId) {
        // FIXME: Should really check that the tabId is for the 'Find Us' tab.
        return fragmentFindUs(model, contentId);
	}

    /* *** private *** */

    private String fragmentFindUs(Model model, String contentId) {
        model.addAttribute("tab", resolveFindUsTab(ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId)));
        return "views/fragmentFindUs";
    }

    private String fragmentCategory(Model model, String contentName, String contentId, Region region, String tabId, String categoryId) {
        DigitalDisplayEntry dde = ALL_DIGITAL_DISPLAY_ENTRIES.byContentId(contentId);

        TabLocation defaultTabCategory = getDefaultTabCategory(dde);
        TabLocation tabLocation = resolveFindUsTabLocation(dde);
        model.addAttribute("location", new Location(new PrimaryId(BASE_URL_PREFIX, contentName, contentId, region),
                tabLocation,
                defaultTabCategory,
                resolveFindUsTabLocation(dde).getTabId(),
                region,
                LOCATION_NO_CONTACT_ID));
        model.addAttribute("category", resolveCategory(dde, tabId, categoryId));
        return "views/fragmentCategory";

    }

    private Category resolveCategory(DigitalDisplayEntry dde, final String tabId, final String categoryId) {
        return FluentIterable.from(dde.getTabs()).firstMatch(new Predicate<Tab>()
        {
            @Override
            public boolean apply(Tab tab)
            {
                return tab.getId().equals(tabId);
            }
        }).transform(new Function<Tab, Category>()
        {
            @Override
            public Category apply(Tab tab)
            {
                return FluentIterable.from(tab.getCategories()).firstMatch(new Predicate<Category>()
                {
                    @Override
                    public boolean apply(Category category)
                    {
                        return category.getId().equals(categoryId);
                    }
                }).orNull();
            }
        }).orNull();
    }

    private Tab resolveFindUsTab(DigitalDisplayEntry dde) {
        return FluentIterable.from(dde.getTabs()).firstMatch(new Predicate<Tab>()
        {
            @Override
            public boolean apply(Tab tab)
            {
                return FindUsTab.class.isAssignableFrom(tab.getClass());
            }
        }).orNull();
    }

    private TabLocation resolveFindUsTabLocation(DigitalDisplayEntry dde) {
        Tab tab = resolveFindUsTab(dde);
        return new TabLocation(tab != null ? tab.getId() : "none", LOCATION_NO_CATEGORY);
    }

    private TabLocation getDefaultTabCategory(DigitalDisplayEntry dde) {
        ContactTab firstTab = (ContactTab) dde.getTabs().get(0);
        return new TabLocation(firstTab.getId(), firstTab.getCategories().get(0).getId());
    }

    private String render(DigitalDisplayEntry dde, Model model) {
        model.addAttribute("dde", dde);
        return "views/businessListing";
    }

    private String renderNotFoundMessage(Model model, String contentName, String contentId)
    {
        model.addAttribute("baseUrlPrefix", BASE_URL_PREFIX);
        model.addAttribute("contentName", contentName);
        model.addAttribute("contentId", contentId);
        model.addAttribute("ddes", ALL_DIGITAL_DISPLAY_ENTRIES.allContentIdentifiers());
        return "views/notFound";
    }

}
