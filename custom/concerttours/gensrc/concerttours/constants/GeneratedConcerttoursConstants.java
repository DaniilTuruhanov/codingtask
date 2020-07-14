/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14.07.2020 12:02:46                         ---
 * ----------------------------------------------------------------
 */
package concerttours.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedConcerttoursConstants
{
	public static final String EXTENSIONNAME = "concerttours";
	public static class TC
	{
		public static final String BAND = "Band".intern();
		public static final String CITYANDBAND = "CityAndBand".intern();
		public static final String CONCERT = "Concert".intern();
		public static final String CONCERTINFO = "ConcertInfo".intern();
		public static final String CONTACTREQUEST = "ContactRequest".intern();
		public static final String EXTENDCONCERT = "ExtendConcert".intern();
		public static final String INSTRUMENT = "Instrument".intern();
		public static final String MUSICTYPE = "MusicType".intern();
		public static final String NEWS = "News".intern();
		public static final String NOTLOREMIPSUMCONSTRAINT = "NotLoremIpsumConstraint".intern();
		public static final String OPENORCLOSE = "OpenOrClose".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String BANDS = "bands".intern();
			public static final String CONCERT = "concert".intern();
			public static final String INSTRUMENT = "instrument".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
			public static final String HASHTAG = "hashtag".intern();
		}
	}
	public static class Enumerations
	{
		public static class MusicType
		{
			// no values defined
		}
		public static class OpenOrClose
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
	}
	public static class Relations
	{
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String CONCERT2BAND = "Concert2Band".intern();
		public static final String CONCERT2MUSICTYPE = "Concert2MusicType".intern();
		public static final String INSTRUMENT2MUSICTYPE = "Instrument2MusicType".intern();
		public static final String PRODUCT2ROCKBAND = "Product2RockBand".intern();
	}
	
	protected GeneratedConcerttoursConstants()
	{
		// private constructor
	}
	
	
}
