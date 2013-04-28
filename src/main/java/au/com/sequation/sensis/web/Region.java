package au.com.sequation.sensis.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: sbegg
 * Date: 26/04/13
 * Time: 9:32 PM
 */
public class Region

{
    private final String suburb;
    private final String state;
    private final int count;

    public Region(String suburb, String state, int count)
    {
        this.suburb = suburb;
        this.state = state;
        this.count = count;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public String getState()
    {
        return state;
    }

    public int getCount()
    {
        return count;
    }

    @Override
    public String toString()
    {
        return display(suburb) + ", " + state.toUpperCase();
    }

    private String display(String source) {
        Matcher m = Pattern.compile("\\b[a-z]").matcher(source.replaceAll("-", " "));
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group().toUpperCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
