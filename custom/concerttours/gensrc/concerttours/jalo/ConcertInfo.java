/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 12:02:46                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.jalo.Band;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type ConcertInfo.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class ConcertInfo extends GenericItem
{
	/** Qualifier of the <code>ConcertInfo.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ConcertInfo.band</code> attribute **/
	public static final String BAND = "band";
	/** Qualifier of the <code>ConcertInfo.songs</code> attribute **/
	public static final String SONGS = "songs";
	/** Qualifier of the <code>ConcertInfo.openOrClose</code> attribute **/
	public static final String OPENORCLOSE = "openOrClose";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(BAND, AttributeMode.INITIAL);
		tmp.put(SONGS, AttributeMode.INITIAL);
		tmp.put(OPENORCLOSE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.band</code> attribute.
	 * @return the band
	 */
	public Band getBand(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, "band".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.band</code> attribute.
	 * @return the band
	 */
	public Band getBand()
	{
		return getBand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final SessionContext ctx, final Band value)
	{
		setProperty(ctx, "band".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final Band value)
	{
		setBand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "code".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "code".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.openOrClose</code> attribute.
	 * @return the openOrClose
	 */
	public EnumerationValue getOpenOrClose(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "openOrClose".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.openOrClose</code> attribute.
	 * @return the openOrClose
	 */
	public EnumerationValue getOpenOrClose()
	{
		return getOpenOrClose( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.openOrClose</code> attribute. 
	 * @param value the openOrClose
	 */
	public void setOpenOrClose(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "openOrClose".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.openOrClose</code> attribute. 
	 * @param value the openOrClose
	 */
	public void setOpenOrClose(final EnumerationValue value)
	{
		setOpenOrClose( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.songs</code> attribute.
	 * @return the songs
	 */
	public List<String> getSongs(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, "songs".intern());
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConcertInfo.songs</code> attribute.
	 * @return the songs
	 */
	public List<String> getSongs()
	{
		return getSongs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, "songs".intern(),value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConcertInfo.songs</code> attribute. 
	 * @param value the songs
	 */
	public void setSongs(final List<String> value)
	{
		setSongs( getSession().getSessionContext(), value );
	}
	
}
