/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 12:02:46                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type CityAndBand.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class CityAndBand extends GenericItem
{
	/** Qualifier of the <code>CityAndBand.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CityAndBand.city2Band</code> attribute **/
	public static final String CITY2BAND = "city2Band";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CITY2BAND, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityAndBand.city2Band</code> attribute.
	 * @return the city2Band
	 */
	public Map<String,String> getAllCity2Band(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, "city2Band".intern());
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityAndBand.city2Band</code> attribute.
	 * @return the city2Band
	 */
	public Map<String,String> getAllCity2Band()
	{
		return getAllCity2Band( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityAndBand.city2Band</code> attribute. 
	 * @param value the city2Band
	 */
	public void setAllCity2Band(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, "city2Band".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityAndBand.city2Band</code> attribute. 
	 * @param value the city2Band
	 */
	public void setAllCity2Band(final Map<String,String> value)
	{
		setAllCity2Band( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityAndBand.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CityAndBand.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityAndBand.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CityAndBand.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
