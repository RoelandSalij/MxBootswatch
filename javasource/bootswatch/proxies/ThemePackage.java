// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bootswatch.proxies;

public class ThemePackage extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Bootswatch.ThemePackage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Minified("Minified"),
		Defaulttheme("Defaulttheme"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		ThemePackage_Theme("Bootswatch.ThemePackage_Theme");

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

	public ThemePackage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Bootswatch.ThemePackage"));
	}

	protected ThemePackage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject themePackageMendixObject)
	{
		super(context, themePackageMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Bootswatch.ThemePackage", themePackageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Bootswatch.ThemePackage");
	}

	/**
	 * @deprecated Use 'ThemePackage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static bootswatch.proxies.ThemePackage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bootswatch.proxies.ThemePackage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static bootswatch.proxies.ThemePackage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bootswatch.proxies.ThemePackage(context, mendixObject);
	}

	public static bootswatch.proxies.ThemePackage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bootswatch.proxies.ThemePackage.initialize(context, mendixObject);
	}

	public static java.util.List<bootswatch.proxies.ThemePackage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<bootswatch.proxies.ThemePackage> result = new java.util.ArrayList<bootswatch.proxies.ThemePackage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Bootswatch.ThemePackage" + xpathConstraint))
			result.add(bootswatch.proxies.ThemePackage.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Minified
	 */
	public final java.lang.Boolean getMinified()
	{
		return getMinified(getContext());
	}

	/**
	 * @param context
	 * @return value of Minified
	 */
	public final java.lang.Boolean getMinified(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Minified.toString());
	}

	/**
	 * Set value of Minified
	 * @param minified
	 */
	public final void setMinified(java.lang.Boolean minified)
	{
		setMinified(getContext(), minified);
	}

	/**
	 * Set value of Minified
	 * @param context
	 * @param minified
	 */
	public final void setMinified(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean minified)
	{
		getMendixObject().setValue(context, MemberNames.Minified.toString(), minified);
	}

	/**
	 * @return value of Defaulttheme
	 */
	public final java.lang.Boolean getDefaulttheme()
	{
		return getDefaulttheme(getContext());
	}

	/**
	 * @param context
	 * @return value of Defaulttheme
	 */
	public final java.lang.Boolean getDefaulttheme(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Defaulttheme.toString());
	}

	/**
	 * Set value of Defaulttheme
	 * @param defaulttheme
	 */
	public final void setDefaulttheme(java.lang.Boolean defaulttheme)
	{
		setDefaulttheme(getContext(), defaulttheme);
	}

	/**
	 * Set value of Defaulttheme
	 * @param context
	 * @param defaulttheme
	 */
	public final void setDefaulttheme(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean defaulttheme)
	{
		getMendixObject().setValue(context, MemberNames.Defaulttheme.toString(), defaulttheme);
	}

	/**
	 * @return value of ThemePackage_Theme
	 */
	public final bootswatch.proxies.Theme getThemePackage_Theme() throws com.mendix.core.CoreException
	{
		return getThemePackage_Theme(getContext());
	}

	/**
	 * @param context
	 * @return value of ThemePackage_Theme
	 */
	public final bootswatch.proxies.Theme getThemePackage_Theme(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		bootswatch.proxies.Theme result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ThemePackage_Theme.toString());
		if (identifier != null)
			result = bootswatch.proxies.Theme.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ThemePackage_Theme
	 * @param themepackage_theme
	 */
	public final void setThemePackage_Theme(bootswatch.proxies.Theme themepackage_theme)
	{
		setThemePackage_Theme(getContext(), themepackage_theme);
	}

	/**
	 * Set value of ThemePackage_Theme
	 * @param context
	 * @param themepackage_theme
	 */
	public final void setThemePackage_Theme(com.mendix.systemwideinterfaces.core.IContext context, bootswatch.proxies.Theme themepackage_theme)
	{
		if (themepackage_theme == null)
			getMendixObject().setValue(context, MemberNames.ThemePackage_Theme.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ThemePackage_Theme.toString(), themepackage_theme.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final bootswatch.proxies.ThemePackage that = (bootswatch.proxies.ThemePackage) obj;
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
		return "Bootswatch.ThemePackage";
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
