/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 14:10:25                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Band;
import concerttours.jalo.CityAndBand;
import concerttours.jalo.Concert;
import concerttours.jalo.ConcertInfo;
import concerttours.jalo.ContactRequest;
import concerttours.jalo.ExtendConcert;
import concerttours.jalo.Instrument;
import concerttours.jalo.News;
import concerttours.jalo.NotLoremIpsumConstraint;
import concerttours.jalo.Producer;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>ConcerttoursManager</code>.
 */
@SuppressWarnings({"unused","cast","PMD"})
@SLDSafe
public class ConcerttoursManager extends Extension
{
	/** Relation ordering override parameter constants for Band2MusicType from ((concerttours))*/
	protected static String BAND2MUSICTYPE_SRC_ORDERED = "relation.Band2MusicType.source.ordered";
	protected static String BAND2MUSICTYPE_TGT_ORDERED = "relation.Band2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Band2MusicType from ((concerttours))*/
	protected static String BAND2MUSICTYPE_MARKMODIFIED = "relation.Band2MusicType.markmodified";
	/** Relation ordering override parameter constants for Concert2MusicType from ((concerttours))*/
	protected static String CONCERT2MUSICTYPE_SRC_ORDERED = "relation.Concert2MusicType.source.ordered";
	protected static String CONCERT2MUSICTYPE_TGT_ORDERED = "relation.Concert2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Concert2MusicType from ((concerttours))*/
	protected static String CONCERT2MUSICTYPE_MARKMODIFIED = "relation.Concert2MusicType.markmodified";
	/** Relation ordering override parameter constants for Instrument2MusicType from ((concerttours))*/
	protected static String INSTRUMENT2MUSICTYPE_SRC_ORDERED = "relation.Instrument2MusicType.source.ordered";
	protected static String INSTRUMENT2MUSICTYPE_TGT_ORDERED = "relation.Instrument2MusicType.target.ordered";
	/** Relation disable markmodifed parameter constants for Instrument2MusicType from ((concerttours))*/
	protected static String INSTRUMENT2MUSICTYPE_MARKMODIFIED = "relation.Instrument2MusicType.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("hashtag", AttributeMode.INITIAL);
		tmp.put("band", AttributeMode.INITIAL);
		tmp.put("producer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.band</code> attribute.
	 * @return the band
	 */
	public Band getBand(final SessionContext ctx, final Product item)
	{
		return (Band)item.getProperty( ctx, ConcerttoursConstants.Attributes.Product.BAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.band</code> attribute.
	 * @return the band
	 */
	public Band getBand(final Product item)
	{
		return getBand( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final SessionContext ctx, final Product item, final Band value)
	{
		item.setProperty(ctx, ConcerttoursConstants.Attributes.Product.BAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.band</code> attribute. 
	 * @param value the band
	 */
	public void setBand(final Product item, final Band value)
	{
		setBand( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.bands</code> attribute.
	 * @return the bands
	 */
	public Set<Band> getBands(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Band> items = item.getLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.BAND2MUSICTYPE,
			"Band",
			null,
			false,
			false
		);
		return new LinkedHashSet<Band>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.bands</code> attribute.
	 * @return the bands
	 */
	public Set<Band> getBands(final EnumerationValue item)
	{
		return getBands( getSession().getSessionContext(), item );
	}
	
	public long getBandsCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ConcerttoursConstants.Relations.BAND2MUSICTYPE,
			"Band",
			null
		);
	}
	
	public long getBandsCount(final EnumerationValue item)
	{
		return getBandsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final SessionContext ctx, final EnumerationValue item, final Set<Band> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.BAND2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(BAND2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.bands</code> attribute. 
	 * @param value the bands
	 */
	public void setBands(final EnumerationValue item, final Set<Band> value)
	{
		setBands( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bands. 
	 * @param value the item to add to bands
	 */
	public void addToBands(final SessionContext ctx, final EnumerationValue item, final Band value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.BAND2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BAND2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bands. 
	 * @param value the item to add to bands
	 */
	public void addToBands(final EnumerationValue item, final Band value)
	{
		addToBands( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bands. 
	 * @param value the item to remove from bands
	 */
	public void removeFromBands(final SessionContext ctx, final EnumerationValue item, final Band value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.BAND2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(BAND2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bands. 
	 * @param value the item to remove from bands
	 */
	public void removeFromBands(final EnumerationValue item, final Band value)
	{
		removeFromBands( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.concert</code> attribute.
	 * @return the concert
	 */
	public Set<Concert> getConcert(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Concert> items = item.getLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			"Concert",
			null,
			false,
			false
		);
		return new LinkedHashSet<Concert>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.concert</code> attribute.
	 * @return the concert
	 */
	public Set<Concert> getConcert(final EnumerationValue item)
	{
		return getConcert( getSession().getSessionContext(), item );
	}
	
	public long getConcertCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			"Concert",
			null
		);
	}
	
	public long getConcertCount(final EnumerationValue item)
	{
		return getConcertCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.concert</code> attribute. 
	 * @param value the concert
	 */
	public void setConcert(final SessionContext ctx, final EnumerationValue item, final Set<Concert> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.concert</code> attribute. 
	 * @param value the concert
	 */
	public void setConcert(final EnumerationValue item, final Set<Concert> value)
	{
		setConcert( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to concert. 
	 * @param value the item to add to concert
	 */
	public void addToConcert(final SessionContext ctx, final EnumerationValue item, final Concert value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to concert. 
	 * @param value the item to add to concert
	 */
	public void addToConcert(final EnumerationValue item, final Concert value)
	{
		addToConcert( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from concert. 
	 * @param value the item to remove from concert
	 */
	public void removeFromConcert(final SessionContext ctx, final EnumerationValue item, final Concert value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.CONCERT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONCERT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from concert. 
	 * @param value the item to remove from concert
	 */
	public void removeFromConcert(final EnumerationValue item, final Concert value)
	{
		removeFromConcert( getSession().getSessionContext(), item, value );
	}
	
	public Band createBand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Band");
			return (Band)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Band : "+e.getMessage(), 0 );
		}
	}
	
	public Band createBand(final Map attributeValues)
	{
		return createBand( getSession().getSessionContext(), attributeValues );
	}
	
	public CityAndBand createCityAndBand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CityAndBand");
			return (CityAndBand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CityAndBand : "+e.getMessage(), 0 );
		}
	}
	
	public CityAndBand createCityAndBand(final Map attributeValues)
	{
		return createCityAndBand( getSession().getSessionContext(), attributeValues );
	}
	
	public Concert createConcert(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Concert");
			return (Concert)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Concert : "+e.getMessage(), 0 );
		}
	}
	
	public Concert createConcert(final Map attributeValues)
	{
		return createConcert( getSession().getSessionContext(), attributeValues );
	}
	
	public ConcertInfo createConcertInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ConcertInfo");
			return (ConcertInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ConcertInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ConcertInfo createConcertInfo(final Map attributeValues)
	{
		return createConcertInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ContactRequest createContactRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ContactRequest");
			return (ContactRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ContactRequest : "+e.getMessage(), 0 );
		}
	}
	
	public ContactRequest createContactRequest(final Map attributeValues)
	{
		return createContactRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public ExtendConcert createExtendConcert(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("ExtendConcert");
			return (ExtendConcert)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ExtendConcert : "+e.getMessage(), 0 );
		}
	}
	
	public ExtendConcert createExtendConcert(final Map attributeValues)
	{
		return createExtendConcert( getSession().getSessionContext(), attributeValues );
	}
	
	public Instrument createInstrument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Instrument");
			return (Instrument)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Instrument : "+e.getMessage(), 0 );
		}
	}
	
	public Instrument createInstrument(final Map attributeValues)
	{
		return createInstrument( getSession().getSessionContext(), attributeValues );
	}
	
	public News createNews(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("News");
			return (News)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating News : "+e.getMessage(), 0 );
		}
	}
	
	public News createNews(final Map attributeValues)
	{
		return createNews( getSession().getSessionContext(), attributeValues );
	}
	
	public NotLoremIpsumConstraint createNotLoremIpsumConstraint(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("NotLoremIpsumConstraint");
			return (NotLoremIpsumConstraint)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating NotLoremIpsumConstraint : "+e.getMessage(), 0 );
		}
	}
	
	public NotLoremIpsumConstraint createNotLoremIpsumConstraint(final Map attributeValues)
	{
		return createNotLoremIpsumConstraint( getSession().getSessionContext(), attributeValues );
	}
	
	public Producer createProducer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Producer");
			return (Producer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Producer : "+e.getMessage(), 0 );
		}
	}
	
	public Producer createProducer(final Map attributeValues)
	{
		return createProducer( getSession().getSessionContext(), attributeValues );
	}
	
	public static final ConcerttoursManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ConcerttoursManager) em.getExtension(ConcerttoursConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return ConcerttoursConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute.
	 * @return the hashtag - hashtag of concert tour for social media
	 */
	public String getHashtag(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getHashtag requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, ConcerttoursConstants.Attributes.Product.HASHTAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute.
	 * @return the hashtag - hashtag of concert tour for social media
	 */
	public String getHashtag(final Product item)
	{
		return getHashtag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute. 
	 * @return the localized hashtag - hashtag of concert tour for social media
	 */
	public Map<Language,String> getAllHashtag(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,ConcerttoursConstants.Attributes.Product.HASHTAG,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.hashtag</code> attribute. 
	 * @return the localized hashtag - hashtag of concert tour for social media
	 */
	public Map<Language,String> getAllHashtag(final Product item)
	{
		return getAllHashtag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setHashtag(final SessionContext ctx, final Product item, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setHashtag requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, ConcerttoursConstants.Attributes.Product.HASHTAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setHashtag(final Product item, final String value)
	{
		setHashtag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setAllHashtag(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,ConcerttoursConstants.Attributes.Product.HASHTAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.hashtag</code> attribute. 
	 * @param value the hashtag - hashtag of concert tour for social media
	 */
	public void setAllHashtag(final Product item, final Map<Language,String> value)
	{
		setAllHashtag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.instrument</code> attribute.
	 * @return the instrument
	 */
	public Set<Instrument> getInstrument(final SessionContext ctx, final EnumerationValue item)
	{
		final List<Instrument> items = item.getLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			"Instrument",
			null,
			false,
			false
		);
		return new LinkedHashSet<Instrument>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MusicType.instrument</code> attribute.
	 * @return the instrument
	 */
	public Set<Instrument> getInstrument(final EnumerationValue item)
	{
		return getInstrument( getSession().getSessionContext(), item );
	}
	
	public long getInstrumentCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			"Instrument",
			null
		);
	}
	
	public long getInstrumentCount(final EnumerationValue item)
	{
		return getInstrumentCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.instrument</code> attribute. 
	 * @param value the instrument
	 */
	public void setInstrument(final SessionContext ctx, final EnumerationValue item, final Set<Instrument> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MusicType.instrument</code> attribute. 
	 * @param value the instrument
	 */
	public void setInstrument(final EnumerationValue item, final Set<Instrument> value)
	{
		setInstrument( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to instrument. 
	 * @param value the item to add to instrument
	 */
	public void addToInstrument(final SessionContext ctx, final EnumerationValue item, final Instrument value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to instrument. 
	 * @param value the item to add to instrument
	 */
	public void addToInstrument(final EnumerationValue item, final Instrument value)
	{
		addToInstrument( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from instrument. 
	 * @param value the item to remove from instrument
	 */
	public void removeFromInstrument(final SessionContext ctx, final EnumerationValue item, final Instrument value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ConcerttoursConstants.Relations.INSTRUMENT2MUSICTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(INSTRUMENT2MUSICTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from instrument. 
	 * @param value the item to remove from instrument
	 */
	public void removeFromInstrument(final EnumerationValue item, final Instrument value)
	{
		removeFromInstrument( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.producer</code> attribute.
	 * @return the producer
	 */
	public Producer getProducer(final SessionContext ctx, final Product item)
	{
		return (Producer)item.getProperty( ctx, ConcerttoursConstants.Attributes.Product.PRODUCER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.producer</code> attribute.
	 * @return the producer
	 */
	public Producer getProducer(final Product item)
	{
		return getProducer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.producer</code> attribute. 
	 * @param value the producer
	 */
	public void setProducer(final SessionContext ctx, final Product item, final Producer value)
	{
		item.setProperty(ctx, ConcerttoursConstants.Attributes.Product.PRODUCER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.producer</code> attribute. 
	 * @param value the producer
	 */
	public void setProducer(final Product item, final Producer value)
	{
		setProducer( getSession().getSessionContext(), item, value );
	}
	
}
