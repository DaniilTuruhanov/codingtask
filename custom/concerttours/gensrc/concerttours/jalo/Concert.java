/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 14:10:25                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type Concert.
 */
@SLDSafe
@SuppressWarnings({"unused","cast","PMD"})
public class Concert extends VariantProduct
{
	/** Qualifier of the <code>Concert.venue</code> attribute **/
	public static final String VENUE = "venue";
	/** Qualifier of the <code>Concert.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Concert.openOrClose</code> attribute **/
	public static final String OPENORCLOSE = "openOrClose";
	/** Qualifier of the <code>Concert.bands</code> attribute **/
	public static final String BANDS = "bands";
	/** Qualifier of the <code>Concert.musicType</code> attribute **/
	public static final String MUSICTYPE = "musicType";
	/** Relation ordering override parameter constants for Concert2MusicType from ((concerttours))*/
	protected static String CONCERT2MUSICTYPE_SRC_ORDERED = "relation.Concert2MusicType.source.ordered";
	protected static String CONCERT2MUSICTYPE_TGT_ORDERED = "relation.Concert2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Concert2MusicType from ((concerttours))*/
	protected static String CONCERT2MUSICTYPE_MARKMODIFIED = "relation.Concert2MusicType.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BANDS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Concert> BANDSHANDLER = new BidirectionalOneToManyHandler<Concert>(
	ConcerttoursConstants.TC.CONCERT,
	false,
	"bands",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VENUE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(OPENORCLOSE, AttributeMode.INITIAL);
		tmp.put(BANDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands(final SessionContext ctx)
	{
		return (Band)getProperty( ctx, "bands".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.bands</code> attribute.
	 * @return the bands
	 */
	public Band getBands()
	{
		return getBands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final SessionContext ctx, final Band value)
	{
		BANDSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final Band value)
	{
		setBands( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BANDSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, "date".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.date</code> attribute.
	 * @return the date - date of concert
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, "date".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.date</code> attribute. 
	 * @param value the date - date of concert
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	@Override
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("MusicType");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.musicType</code> attribute.
	 * @return the musicType
	 */
	public Collection<EnumerationValue> getMusicType(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			"MusicType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.musicType</code> attribute.
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
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			"MusicType",
			null
		);
	}
	
	public long getMusicTypeCount()
	{
		return getMusicTypeCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.musicType</code> attribute. 
	 * @param value the musicType
	 */
	public void setMusicType(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.musicType</code> attribute. 
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
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
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
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
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
	 * <i>Generated method</i> - Getter of the <code>Concert.openOrClose</code> attribute.
	 * @return the openOrClose - type of concert (indoors or open air)
	 */
	public EnumerationValue getOpenOrClose(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "openOrClose".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.openOrClose</code> attribute.
	 * @return the openOrClose - type of concert (indoors or open air)
	 */
	public EnumerationValue getOpenOrClose()
	{
		return getOpenOrClose( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.openOrClose</code> attribute. 
	 * @param value the openOrClose - type of concert (indoors or open air)
	 */
	public void setOpenOrClose(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "openOrClose".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.openOrClose</code> attribute. 
	 * @param value the openOrClose - type of concert (indoors or open air)
	 */
	public void setOpenOrClose(final EnumerationValue value)
	{
		setOpenOrClose( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venue</code> attribute.
	 * @return the venue - venue of concert
	 */
	public String getVenue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "venue".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Concert.venue</code> attribute.
	 * @return the venue - venue of concert
	 */
	public String getVenue()
	{
		return getVenue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venue</code> attribute. 
	 * @param value the venue - venue of concert
	 */
	public void setVenue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "venue".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Concert.venue</code> attribute. 
	 * @param value the venue - venue of concert
	 */
	public void setVenue(final String value)
	{
		setVenue( getSession().getSessionContext(), value );
	}
	
}
