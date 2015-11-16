// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bootswatch.proxies;

/**
 * 
 */
public class Theme extends system.proxies.Image
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Bootswatch.Theme";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PreviewUrl("PreviewUrl"),
		ThemeName("ThemeName"),
		TagLine("TagLine"),
		DevicePreview("DevicePreview"),
		EnumerationSearch("EnumerationSearch"),
		PublicThumbnailPath("PublicThumbnailPath"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Theme(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Bootswatch.Theme"));
	}

	protected Theme(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject themeMendixObject)
	{
		super(context, themeMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Bootswatch.Theme", themeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Bootswatch.Theme");
	}

	/**
	 * @deprecated Use 'Theme.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static bootswatch.proxies.Theme initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bootswatch.proxies.Theme.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static bootswatch.proxies.Theme initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bootswatch.proxies.Theme(context, mendixObject);
	}

	public static bootswatch.proxies.Theme load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bootswatch.proxies.Theme.initialize(context, mendixObject);
	}

	public static java.util.List<bootswatch.proxies.Theme> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<bootswatch.proxies.Theme> result = new java.util.ArrayList<bootswatch.proxies.Theme>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Bootswatch.Theme" + xpathConstraint))
			result.add(bootswatch.proxies.Theme.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of PreviewUrl
	 */
	public final String getPreviewUrl()
	{
		return getPreviewUrl(getContext());
	}

	/**
	 * @param context
	 * @return value of PreviewUrl
	 */
	public final String getPreviewUrl(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.PreviewUrl.toString());
	}

	/**
	 * Set value of PreviewUrl
	 * @param previewurl
	 */
	public final void setPreviewUrl(String previewurl)
	{
		setPreviewUrl(getContext(), previewurl);
	}

	/**
	 * Set value of PreviewUrl
	 * @param context
	 * @param previewurl
	 */
	public final void setPreviewUrl(com.mendix.systemwideinterfaces.core.IContext context, String previewurl)
	{
		getMendixObject().setValue(context, MemberNames.PreviewUrl.toString(), previewurl);
	}

	/**
	 * @return value of ThemeName
	 */
	public final String getThemeName()
	{
		return getThemeName(getContext());
	}

	/**
	 * @param context
	 * @return value of ThemeName
	 */
	public final String getThemeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.ThemeName.toString());
	}

	/**
	 * Set value of ThemeName
	 * @param themename
	 */
	public final void setThemeName(String themename)
	{
		setThemeName(getContext(), themename);
	}

	/**
	 * Set value of ThemeName
	 * @param context
	 * @param themename
	 */
	public final void setThemeName(com.mendix.systemwideinterfaces.core.IContext context, String themename)
	{
		getMendixObject().setValue(context, MemberNames.ThemeName.toString(), themename);
	}

	/**
	 * @return value of TagLine
	 */
	public final String getTagLine()
	{
		return getTagLine(getContext());
	}

	/**
	 * @param context
	 * @return value of TagLine
	 */
	public final String getTagLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.TagLine.toString());
	}

	/**
	 * Set value of TagLine
	 * @param tagline
	 */
	public final void setTagLine(String tagline)
	{
		setTagLine(getContext(), tagline);
	}

	/**
	 * Set value of TagLine
	 * @param context
	 * @param tagline
	 */
	public final void setTagLine(com.mendix.systemwideinterfaces.core.IContext context, String tagline)
	{
		getMendixObject().setValue(context, MemberNames.TagLine.toString(), tagline);
	}

	/**
	 * @return value of DevicePreview
	 */
	public final String getDevicePreview()
	{
		return getDevicePreview(getContext());
	}

	/**
	 * @param context
	 * @return value of DevicePreview
	 */
	public final String getDevicePreview(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.DevicePreview.toString());
	}

	/**
	 * Set value of DevicePreview
	 * @param devicepreview
	 */
	public final void setDevicePreview(String devicepreview)
	{
		setDevicePreview(getContext(), devicepreview);
	}

	/**
	 * Set value of DevicePreview
	 * @param context
	 * @param devicepreview
	 */
	public final void setDevicePreview(com.mendix.systemwideinterfaces.core.IContext context, String devicepreview)
	{
		getMendixObject().setValue(context, MemberNames.DevicePreview.toString(), devicepreview);
	}

	/**
	 * Set value of EnumerationSearch
	 * @param enumerationsearch
	 */
	public final bootswatch.proxies.Options getEnumerationSearch()
	{
		return getEnumerationSearch(getContext());
	}

	/**
	 * @param context
	 * @return value of EnumerationSearch
	 */
	public final bootswatch.proxies.Options getEnumerationSearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.EnumerationSearch.toString());
		if (obj == null)
			return null;

		return bootswatch.proxies.Options.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of EnumerationSearch
	 * @param enumerationsearch
	 */
	public final void setEnumerationSearch(bootswatch.proxies.Options enumerationsearch)
	{
		setEnumerationSearch(getContext(), enumerationsearch);
	}

	/**
	 * Set value of EnumerationSearch
	 * @param context
	 * @param enumerationsearch
	 */
	public final void setEnumerationSearch(com.mendix.systemwideinterfaces.core.IContext context, bootswatch.proxies.Options enumerationsearch)
	{
		if (enumerationsearch != null)
			getMendixObject().setValue(context, MemberNames.EnumerationSearch.toString(), enumerationsearch.toString());
		else
			getMendixObject().setValue(context, MemberNames.EnumerationSearch.toString(), null);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final bootswatch.proxies.Theme that = (bootswatch.proxies.Theme) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Bootswatch.Theme";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
