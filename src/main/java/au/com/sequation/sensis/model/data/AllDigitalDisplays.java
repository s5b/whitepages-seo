package au.com.sequation.sensis.model.data;

import au.com.sequation.sensis.model.DigitalDisplayEntry;
import au.com.sequation.sensis.model.data.entries.EntryColes;
import au.com.sequation.sensis.model.data.entries.EntryJetstar;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * User: sbegg
 * Date: 14/04/13
 * Time: 4:42 PM
 */
public class AllDigitalDisplays
{
    private static final List<DigitalDisplayEntry> INCLUDED_DIGITAL_DISPLAY_ENTRIES = Lists.newArrayList(
            EntryColes.build(),
            EntryJetstar.build());
    private final Map<String, DigitalDisplayEntry> allDigitalDisplays = Maps.newHashMap();

    private AllDigitalDisplays()
    {
        for (DigitalDisplayEntry dde : INCLUDED_DIGITAL_DISPLAY_ENTRIES) {
            allDigitalDisplays.put(dde.getContentId(), dde);
        }
    }

    public static AllDigitalDisplays allDigitalDisplays()
    {
        return new AllDigitalDisplays();
    }

    public DigitalDisplayEntry byContentId(String contentId) {
        return allDigitalDisplays.get(contentId);
    }
}
