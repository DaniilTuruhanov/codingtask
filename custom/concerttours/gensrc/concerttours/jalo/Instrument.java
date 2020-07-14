/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 14:10:25                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Instrument.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class Instrument extends GenericItem
{
	/** Qualifier of the <code>Instrument.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Instrument.cost</code> attribute **/
	public static final String COST = "cost";
	/** Qualifier of the <code>Instrument.musicType</code> attribute **/
	public static final String MUSICTYPE = "musicType";
	/** Relation ordering override parameter constants for Instrument2MusicType from ((concerttours))*/
	protected static String INSTRUMENT2MUSICTYPE_SRC_ORDERED = "relation.Instrument2MusicType.source.ordered";
	protected static String INSTRUMENT2MUSICTYPE_TGT_ORDERED = "relation.Instrument2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Instrument2MusicType from ((concerttours))*/
	protected static String INSTRUMENT2MUSICTYPE_MARKMODIFIED = "relation.Instrument2MusicType.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(COST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.cost</code> attribute.
	 * @return the cost
	 */
	public BigDecimal getCost(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, "cost".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.cost</code> attribute.
	 * @return the cost
	 */
	public BigDecimal getCost()
	{
		return getCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, "cost".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final BigDecimal value)
	{
		setCost( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MusicType");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.musicType</code> attribute.
	 * @return the musicType
	 */
	public Collection<EnumerationValue> getMusicType(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			"MusicType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.musicType</code> attribute.
	 * @return the musicType
	 */
	public Collection<EnumerationValue> getMusicType()
	{
		return getMusicType( getSession().getSessionContext() );
	}
	
	public long getMusicTypeCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			"MusicType",
			null
		);
	}
	
	public long getMusicTypeCount()
	{
		return getMusicTypeCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.musicType</code> attribute. 
	 * @param value the musicType
	 */
	public void setMusicType(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.musicType</code> attribute. 
	 * @param value the musicType
	 */
	public void setMusicType(final Collection<EnumerationValue> value)
	{
		setMusicType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to musicType. 
	 * @param value the item to add to musicType
	 */
	public void addToMusicType(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to musicType. 
	 * @param value the item to add to musicType
	 */
	public void addToMusicType(final EnumerationValue value)
	{
		addToMusicType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from musicType. 
	 * @param value the item to remove from musicType
	 */
	public void removeFromMusicType(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from musicType. 
	 * @param value the item to remove from musicType
	 */
	public void removeFromMusicType(final EnumerationValue value)
	{
		removeFromMusicType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("Instrument.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,"name".intern(),C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Instrument.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("Instrument.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,"name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Instrument.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
