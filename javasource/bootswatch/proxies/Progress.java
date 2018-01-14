// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bootswatch.proxies;

public class Progress
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject progressMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Bootswatch.Progress";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		BasicProgressBar("BasicProgressBar"),
		ContextualAlt1("ContextualAlt1"),
		ContextualAlt2("ContextualAlt2"),
		ContextualAlt3("ContextualAlt3"),
		ContextualAlt4("ContextualAlt4"),
		Striped1("Striped1"),
		Striped2("Striped2"),
		Striped3("Striped3"),
		Striped4("Striped4"),
		Animated("Animated"),
		Stacked1("Stacked1"),
		Stacked2("Stacked2"),
		Stacked3("Stacked3");

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

	public Progress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Bootswatch.Progress"));
	}

	protected Progress(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject progressMendixObject)
	{
		if (progressMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Bootswatch.Progress", progressMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Bootswatch.Progress");

		this.progressMendixObject = progressMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Progress.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static bootswatch.proxies.Progress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bootswatch.proxies.Progress.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static bootswatch.proxies.Progress initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bootswatch.proxies.Progress(context, mendixObject);
	}

	public static bootswatch.proxies.Progress load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bootswatch.proxies.Progress.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of BasicProgressBar
	 */
	public final java.lang.Integer getBasicProgressBar()
	{
		return getBasicProgressBar(getContext());
	}

	/**
	 * @param context
	 * @return value of BasicProgressBar
	 */
	public final java.lang.Integer getBasicProgressBar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.BasicProgressBar.toString());
	}

	/**
	 * Set value of BasicProgressBar
	 * @param basicprogressbar
	 */
	public final void setBasicProgressBar(java.lang.Integer basicprogressbar)
	{
		setBasicProgressBar(getContext(), basicprogressbar);
	}

	/**
	 * Set value of BasicProgressBar
	 * @param context
	 * @param basicprogressbar
	 */
	public final void setBasicProgressBar(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer basicprogressbar)
	{
		getMendixObject().setValue(context, MemberNames.BasicProgressBar.toString(), basicprogressbar);
	}

	/**
	 * @return value of ContextualAlt1
	 */
	public final java.lang.Integer getContextualAlt1()
	{
		return getContextualAlt1(getContext());
	}

	/**
	 * @param context
	 * @return value of ContextualAlt1
	 */
	public final java.lang.Integer getContextualAlt1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ContextualAlt1.toString());
	}

	/**
	 * Set value of ContextualAlt1
	 * @param contextualalt1
	 */
	public final void setContextualAlt1(java.lang.Integer contextualalt1)
	{
		setContextualAlt1(getContext(), contextualalt1);
	}

	/**
	 * Set value of ContextualAlt1
	 * @param context
	 * @param contextualalt1
	 */
	public final void setContextualAlt1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contextualalt1)
	{
		getMendixObject().setValue(context, MemberNames.ContextualAlt1.toString(), contextualalt1);
	}

	/**
	 * @return value of ContextualAlt2
	 */
	public final java.lang.Integer getContextualAlt2()
	{
		return getContextualAlt2(getContext());
	}

	/**
	 * @param context
	 * @return value of ContextualAlt2
	 */
	public final java.lang.Integer getContextualAlt2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ContextualAlt2.toString());
	}

	/**
	 * Set value of ContextualAlt2
	 * @param contextualalt2
	 */
	public final void setContextualAlt2(java.lang.Integer contextualalt2)
	{
		setContextualAlt2(getContext(), contextualalt2);
	}

	/**
	 * Set value of ContextualAlt2
	 * @param context
	 * @param contextualalt2
	 */
	public final void setContextualAlt2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contextualalt2)
	{
		getMendixObject().setValue(context, MemberNames.ContextualAlt2.toString(), contextualalt2);
	}

	/**
	 * @return value of ContextualAlt3
	 */
	public final java.lang.Integer getContextualAlt3()
	{
		return getContextualAlt3(getContext());
	}

	/**
	 * @param context
	 * @return value of ContextualAlt3
	 */
	public final java.lang.Integer getContextualAlt3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ContextualAlt3.toString());
	}

	/**
	 * Set value of ContextualAlt3
	 * @param contextualalt3
	 */
	public final void setContextualAlt3(java.lang.Integer contextualalt3)
	{
		setContextualAlt3(getContext(), contextualalt3);
	}

	/**
	 * Set value of ContextualAlt3
	 * @param context
	 * @param contextualalt3
	 */
	public final void setContextualAlt3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contextualalt3)
	{
		getMendixObject().setValue(context, MemberNames.ContextualAlt3.toString(), contextualalt3);
	}

	/**
	 * @return value of ContextualAlt4
	 */
	public final java.lang.Integer getContextualAlt4()
	{
		return getContextualAlt4(getContext());
	}

	/**
	 * @param context
	 * @return value of ContextualAlt4
	 */
	public final java.lang.Integer getContextualAlt4(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ContextualAlt4.toString());
	}

	/**
	 * Set value of ContextualAlt4
	 * @param contextualalt4
	 */
	public final void setContextualAlt4(java.lang.Integer contextualalt4)
	{
		setContextualAlt4(getContext(), contextualalt4);
	}

	/**
	 * Set value of ContextualAlt4
	 * @param context
	 * @param contextualalt4
	 */
	public final void setContextualAlt4(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer contextualalt4)
	{
		getMendixObject().setValue(context, MemberNames.ContextualAlt4.toString(), contextualalt4);
	}

	/**
	 * @return value of Striped1
	 */
	public final java.lang.Integer getStriped1()
	{
		return getStriped1(getContext());
	}

	/**
	 * @param context
	 * @return value of Striped1
	 */
	public final java.lang.Integer getStriped1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Striped1.toString());
	}

	/**
	 * Set value of Striped1
	 * @param striped1
	 */
	public final void setStriped1(java.lang.Integer striped1)
	{
		setStriped1(getContext(), striped1);
	}

	/**
	 * Set value of Striped1
	 * @param context
	 * @param striped1
	 */
	public final void setStriped1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer striped1)
	{
		getMendixObject().setValue(context, MemberNames.Striped1.toString(), striped1);
	}

	/**
	 * @return value of Striped2
	 */
	public final java.lang.Integer getStriped2()
	{
		return getStriped2(getContext());
	}

	/**
	 * @param context
	 * @return value of Striped2
	 */
	public final java.lang.Integer getStriped2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Striped2.toString());
	}

	/**
	 * Set value of Striped2
	 * @param striped2
	 */
	public final void setStriped2(java.lang.Integer striped2)
	{
		setStriped2(getContext(), striped2);
	}

	/**
	 * Set value of Striped2
	 * @param context
	 * @param striped2
	 */
	public final void setStriped2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer striped2)
	{
		getMendixObject().setValue(context, MemberNames.Striped2.toString(), striped2);
	}

	/**
	 * @return value of Striped3
	 */
	public final java.lang.Integer getStriped3()
	{
		return getStriped3(getContext());
	}

	/**
	 * @param context
	 * @return value of Striped3
	 */
	public final java.lang.Integer getStriped3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Striped3.toString());
	}

	/**
	 * Set value of Striped3
	 * @param striped3
	 */
	public final void setStriped3(java.lang.Integer striped3)
	{
		setStriped3(getContext(), striped3);
	}

	/**
	 * Set value of Striped3
	 * @param context
	 * @param striped3
	 */
	public final void setStriped3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer striped3)
	{
		getMendixObject().setValue(context, MemberNames.Striped3.toString(), striped3);
	}

	/**
	 * @return value of Striped4
	 */
	public final java.lang.Integer getStriped4()
	{
		return getStriped4(getContext());
	}

	/**
	 * @param context
	 * @return value of Striped4
	 */
	public final java.lang.Integer getStriped4(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Striped4.toString());
	}

	/**
	 * Set value of Striped4
	 * @param striped4
	 */
	public final void setStriped4(java.lang.Integer striped4)
	{
		setStriped4(getContext(), striped4);
	}

	/**
	 * Set value of Striped4
	 * @param context
	 * @param striped4
	 */
	public final void setStriped4(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer striped4)
	{
		getMendixObject().setValue(context, MemberNames.Striped4.toString(), striped4);
	}

	/**
	 * @return value of Animated
	 */
	public final java.lang.Integer getAnimated()
	{
		return getAnimated(getContext());
	}

	/**
	 * @param context
	 * @return value of Animated
	 */
	public final java.lang.Integer getAnimated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Animated.toString());
	}

	/**
	 * Set value of Animated
	 * @param animated
	 */
	public final void setAnimated(java.lang.Integer animated)
	{
		setAnimated(getContext(), animated);
	}

	/**
	 * Set value of Animated
	 * @param context
	 * @param animated
	 */
	public final void setAnimated(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer animated)
	{
		getMendixObject().setValue(context, MemberNames.Animated.toString(), animated);
	}

	/**
	 * @return value of Stacked1
	 */
	public final java.lang.Integer getStacked1()
	{
		return getStacked1(getContext());
	}

	/**
	 * @param context
	 * @return value of Stacked1
	 */
	public final java.lang.Integer getStacked1(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stacked1.toString());
	}

	/**
	 * Set value of Stacked1
	 * @param stacked1
	 */
	public final void setStacked1(java.lang.Integer stacked1)
	{
		setStacked1(getContext(), stacked1);
	}

	/**
	 * Set value of Stacked1
	 * @param context
	 * @param stacked1
	 */
	public final void setStacked1(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stacked1)
	{
		getMendixObject().setValue(context, MemberNames.Stacked1.toString(), stacked1);
	}

	/**
	 * @return value of Stacked2
	 */
	public final java.lang.Integer getStacked2()
	{
		return getStacked2(getContext());
	}

	/**
	 * @param context
	 * @return value of Stacked2
	 */
	public final java.lang.Integer getStacked2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stacked2.toString());
	}

	/**
	 * Set value of Stacked2
	 * @param stacked2
	 */
	public final void setStacked2(java.lang.Integer stacked2)
	{
		setStacked2(getContext(), stacked2);
	}

	/**
	 * Set value of Stacked2
	 * @param context
	 * @param stacked2
	 */
	public final void setStacked2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stacked2)
	{
		getMendixObject().setValue(context, MemberNames.Stacked2.toString(), stacked2);
	}

	/**
	 * @return value of Stacked3
	 */
	public final java.lang.Integer getStacked3()
	{
		return getStacked3(getContext());
	}

	/**
	 * @param context
	 * @return value of Stacked3
	 */
	public final java.lang.Integer getStacked3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Stacked3.toString());
	}

	/**
	 * Set value of Stacked3
	 * @param stacked3
	 */
	public final void setStacked3(java.lang.Integer stacked3)
	{
		setStacked3(getContext(), stacked3);
	}

	/**
	 * Set value of Stacked3
	 * @param context
	 * @param stacked3
	 */
	public final void setStacked3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer stacked3)
	{
		getMendixObject().setValue(context, MemberNames.Stacked3.toString(), stacked3);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return progressMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final bootswatch.proxies.Progress that = (bootswatch.proxies.Progress) obj;
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
		return "Bootswatch.Progress";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
