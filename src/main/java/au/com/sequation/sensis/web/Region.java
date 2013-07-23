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
    private final boolean near;
    private final int count;

    public Region(String suburb, String state, boolean near, int count)
    {
        this.suburb = suburb != null ? suburb.trim() : "";
        this.state = state != null ? state.trim() : "";
        this.near = near;
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

    public boolean isNear()
    {
        return near;
    }

    public boolean isRegioned() {
        return suburb.length() > 0 && state.length() > 0;
    }

    @Override
    public String toString()
    {
        return (isNear() ? "near " : "in ") + display(suburb) + ", " + state.toUpperCase();
    }

    public String getUrlParameter() {
        return isRegioned() ? (near ? "/near" : "") + "/" + suburb + "-" + state : "";
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
