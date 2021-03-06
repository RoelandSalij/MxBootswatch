// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package bootswatch.proxies;

public class FormInput
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject formInputMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Bootswatch.FormInput";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Email("Email"),
		Password("Password"),
		TextArea("TextArea"),
		Radios("Radios"),
		Selects("Selects"),
		FocusedInput("FocusedInput"),
		DisabledInput("DisabledInput"),
		InputWarning("InputWarning"),
		InputError("InputError"),
		InputSuccess("InputSuccess"),
		LargeInput("LargeInput"),
		DefaultInput("DefaultInput"),
		SmallInput("SmallInput"),
		InputAddons("InputAddons"),
		Checkbox("Checkbox"),
		PanelHeader("PanelHeader"),
		PanelContent("PanelContent"),
		PanelFooter("PanelFooter"),
		Date("Date");

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

	public FormInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Bootswatch.FormInput"));
	}

	protected FormInput(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject formInputMendixObject)
	{
		if (formInputMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Bootswatch.FormInput", formInputMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Bootswatch.FormInput");

		this.formInputMendixObject = formInputMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'FormInput.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static bootswatch.proxies.FormInput initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return bootswatch.proxies.FormInput.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static bootswatch.proxies.FormInput initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new bootswatch.proxies.FormInput(context, mendixObject);
	}

	public static bootswatch.proxies.FormInput load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return bootswatch.proxies.FormInput.initialize(context, mendixObject);
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
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of Password
	 */
	public final java.lang.String getPassword()
	{
		return getPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of Password
	 */
	public final java.lang.String getPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Password.toString());
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(java.lang.String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of TextArea
	 */
	public final java.lang.String getTextArea()
	{
		return getTextArea(getContext());
	}

	/**
	 * @param context
	 * @return value of TextArea
	 */
	public final java.lang.String getTextArea(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.TextArea.toString());
	}

	/**
	 * Set value of TextArea
	 * @param textarea
	 */
	public final void setTextArea(java.lang.String textarea)
	{
		setTextArea(getContext(), textarea);
	}

	/**
	 * Set value of TextArea
	 * @param context
	 * @param textarea
	 */
	public final void setTextArea(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String textarea)
	{
		getMendixObject().setValue(context, MemberNames.TextArea.toString(), textarea);
	}

	/**
	 * Set value of Radios
	 * @param radios
	 */
	public final bootswatch.proxies.Options getRadios()
	{
		return getRadios(getContext());
	}

	/**
	 * @param context
	 * @return value of Radios
	 */
	public final bootswatch.proxies.Options getRadios(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Radios.toString());
		if (obj == null)
			return null;

		return bootswatch.proxies.Options.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Radios
	 * @param radios
	 */
	public final void setRadios(bootswatch.proxies.Options radios)
	{
		setRadios(getContext(), radios);
	}

	/**
	 * Set value of Radios
	 * @param context
	 * @param radios
	 */
	public final void setRadios(com.mendix.systemwideinterfaces.core.IContext context, bootswatch.proxies.Options radios)
	{
		if (radios != null)
			getMendixObject().setValue(context, MemberNames.Radios.toString(), radios.toString());
		else
			getMendixObject().setValue(context, MemberNames.Radios.toString(), null);
	}

	/**
	 * Set value of Selects
	 * @param selects
	 */
	public final bootswatch.proxies.Selects getSelects()
	{
		return getSelects(getContext());
	}

	/**
	 * @param context
	 * @return value of Selects
	 */
	public final bootswatch.proxies.Selects getSelects(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Selects.toString());
		if (obj == null)
			return null;

		return bootswatch.proxies.Selects.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Selects
	 * @param selects
	 */
	public final void setSelects(bootswatch.proxies.Selects selects)
	{
		setSelects(getContext(), selects);
	}

	/**
	 * Set value of Selects
	 * @param context
	 * @param selects
	 */
	public final void setSelects(com.mendix.systemwideinterfaces.core.IContext context, bootswatch.proxies.Selects selects)
	{
		if (selects != null)
			getMendixObject().setValue(context, MemberNames.Selects.toString(), selects.toString());
		else
			getMendixObject().setValue(context, MemberNames.Selects.toString(), null);
	}

	/**
	 * @return value of FocusedInput
	 */
	public final java.lang.String getFocusedInput()
	{
		return getFocusedInput(getContext());
	}

	/**
	 * @param context
	 * @return value of FocusedInput
	 */
	public final java.lang.String getFocusedInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FocusedInput.toString());
	}

	/**
	 * Set value of FocusedInput
	 * @param focusedinput
	 */
	public final void setFocusedInput(java.lang.String focusedinput)
	{
		setFocusedInput(getContext(), focusedinput);
	}

	/**
	 * Set value of FocusedInput
	 * @param context
	 * @param focusedinput
	 */
	public final void setFocusedInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String focusedinput)
	{
		getMendixObject().setValue(context, MemberNames.FocusedInput.toString(), focusedinput);
	}

	/**
	 * @return value of DisabledInput
	 */
	public final java.lang.String getDisabledInput()
	{
		return getDisabledInput(getContext());
	}

	/**
	 * @param context
	 * @return value of DisabledInput
	 */
	public final java.lang.String getDisabledInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DisabledInput.toString());
	}

	/**
	 * Set value of DisabledInput
	 * @param disabledinput
	 */
	public final void setDisabledInput(java.lang.String disabledinput)
	{
		setDisabledInput(getContext(), disabledinput);
	}

	/**
	 * Set value of DisabledInput
	 * @param context
	 * @param disabledinput
	 */
	public final void setDisabledInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String disabledinput)
	{
		getMendixObject().setValue(context, MemberNames.DisabledInput.toString(), disabledinput);
	}

	/**
	 * @return value of InputWarning
	 */
	public final java.lang.String getInputWarning()
	{
		return getInputWarning(getContext());
	}

	/**
	 * @param context
	 * @return value of InputWarning
	 */
	public final java.lang.String getInputWarning(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputWarning.toString());
	}

	/**
	 * Set value of InputWarning
	 * @param inputwarning
	 */
	public final void setInputWarning(java.lang.String inputwarning)
	{
		setInputWarning(getContext(), inputwarning);
	}

	/**
	 * Set value of InputWarning
	 * @param context
	 * @param inputwarning
	 */
	public final void setInputWarning(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputwarning)
	{
		getMendixObject().setValue(context, MemberNames.InputWarning.toString(), inputwarning);
	}

	/**
	 * @return value of InputError
	 */
	public final java.lang.String getInputError()
	{
		return getInputError(getContext());
	}

	/**
	 * @param context
	 * @return value of InputError
	 */
	public final java.lang.String getInputError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputError.toString());
	}

	/**
	 * Set value of InputError
	 * @param inputerror
	 */
	public final void setInputError(java.lang.String inputerror)
	{
		setInputError(getContext(), inputerror);
	}

	/**
	 * Set value of InputError
	 * @param context
	 * @param inputerror
	 */
	public final void setInputError(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputerror)
	{
		getMendixObject().setValue(context, MemberNames.InputError.toString(), inputerror);
	}

	/**
	 * @return value of InputSuccess
	 */
	public final java.lang.String getInputSuccess()
	{
		return getInputSuccess(getContext());
	}

	/**
	 * @param context
	 * @return value of InputSuccess
	 */
	public final java.lang.String getInputSuccess(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputSuccess.toString());
	}

	/**
	 * Set value of InputSuccess
	 * @param inputsuccess
	 */
	public final void setInputSuccess(java.lang.String inputsuccess)
	{
		setInputSuccess(getContext(), inputsuccess);
	}

	/**
	 * Set value of InputSuccess
	 * @param context
	 * @param inputsuccess
	 */
	public final void setInputSuccess(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputsuccess)
	{
		getMendixObject().setValue(context, MemberNames.InputSuccess.toString(), inputsuccess);
	}

	/**
	 * @return value of LargeInput
	 */
	public final java.lang.String getLargeInput()
	{
		return getLargeInput(getContext());
	}

	/**
	 * @param context
	 * @return value of LargeInput
	 */
	public final java.lang.String getLargeInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LargeInput.toString());
	}

	/**
	 * Set value of LargeInput
	 * @param largeinput
	 */
	public final void setLargeInput(java.lang.String largeinput)
	{
		setLargeInput(getContext(), largeinput);
	}

	/**
	 * Set value of LargeInput
	 * @param context
	 * @param largeinput
	 */
	public final void setLargeInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String largeinput)
	{
		getMendixObject().setValue(context, MemberNames.LargeInput.toString(), largeinput);
	}

	/**
	 * @return value of DefaultInput
	 */
	public final java.lang.String getDefaultInput()
	{
		return getDefaultInput(getContext());
	}

	/**
	 * @param context
	 * @return value of DefaultInput
	 */
	public final java.lang.String getDefaultInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DefaultInput.toString());
	}

	/**
	 * Set value of DefaultInput
	 * @param defaultinput
	 */
	public final void setDefaultInput(java.lang.String defaultinput)
	{
		setDefaultInput(getContext(), defaultinput);
	}

	/**
	 * Set value of DefaultInput
	 * @param context
	 * @param defaultinput
	 */
	public final void setDefaultInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String defaultinput)
	{
		getMendixObject().setValue(context, MemberNames.DefaultInput.toString(), defaultinput);
	}

	/**
	 * @return value of SmallInput
	 */
	public final java.lang.String getSmallInput()
	{
		return getSmallInput(getContext());
	}

	/**
	 * @param context
	 * @return value of SmallInput
	 */
	public final java.lang.String getSmallInput(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SmallInput.toString());
	}

	/**
	 * Set value of SmallInput
	 * @param smallinput
	 */
	public final void setSmallInput(java.lang.String smallinput)
	{
		setSmallInput(getContext(), smallinput);
	}

	/**
	 * Set value of SmallInput
	 * @param context
	 * @param smallinput
	 */
	public final void setSmallInput(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String smallinput)
	{
		getMendixObject().setValue(context, MemberNames.SmallInput.toString(), smallinput);
	}

	/**
	 * @return value of InputAddons
	 */
	public final java.lang.String getInputAddons()
	{
		return getInputAddons(getContext());
	}

	/**
	 * @param context
	 * @return value of InputAddons
	 */
	public final java.lang.String getInputAddons(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.InputAddons.toString());
	}

	/**
	 * Set value of InputAddons
	 * @param inputaddons
	 */
	public final void setInputAddons(java.lang.String inputaddons)
	{
		setInputAddons(getContext(), inputaddons);
	}

	/**
	 * Set value of InputAddons
	 * @param context
	 * @param inputaddons
	 */
	public final void setInputAddons(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String inputaddons)
	{
		getMendixObject().setValue(context, MemberNames.InputAddons.toString(), inputaddons);
	}

	/**
	 * @return value of Checkbox
	 */
	public final java.lang.Boolean getCheckbox()
	{
		return getCheckbox(getContext());
	}

	/**
	 * @param context
	 * @return value of Checkbox
	 */
	public final java.lang.Boolean getCheckbox(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Checkbox.toString());
	}

	/**
	 * Set value of Checkbox
	 * @param checkbox
	 */
	public final void setCheckbox(java.lang.Boolean checkbox)
	{
		setCheckbox(getContext(), checkbox);
	}

	/**
	 * Set value of Checkbox
	 * @param context
	 * @param checkbox
	 */
	public final void setCheckbox(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean checkbox)
	{
		getMendixObject().setValue(context, MemberNames.Checkbox.toString(), checkbox);
	}

	/**
	 * @return value of PanelHeader
	 */
	public final java.lang.String getPanelHeader()
	{
		return getPanelHeader(getContext());
	}

	/**
	 * @param context
	 * @return value of PanelHeader
	 */
	public final java.lang.String getPanelHeader(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PanelHeader.toString());
	}

	/**
	 * Set value of PanelHeader
	 * @param panelheader
	 */
	public final void setPanelHeader(java.lang.String panelheader)
	{
		setPanelHeader(getContext(), panelheader);
	}

	/**
	 * Set value of PanelHeader
	 * @param context
	 * @param panelheader
	 */
	public final void setPanelHeader(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String panelheader)
	{
		getMendixObject().setValue(context, MemberNames.PanelHeader.toString(), panelheader);
	}

	/**
	 * @return value of PanelContent
	 */
	public final java.lang.String getPanelContent()
	{
		return getPanelContent(getContext());
	}

	/**
	 * @param context
	 * @return value of PanelContent
	 */
	public final java.lang.String getPanelContent(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PanelContent.toString());
	}

	/**
	 * Set value of PanelContent
	 * @param panelcontent
	 */
	public final void setPanelContent(java.lang.String panelcontent)
	{
		setPanelContent(getContext(), panelcontent);
	}

	/**
	 * Set value of PanelContent
	 * @param context
	 * @param panelcontent
	 */
	public final void setPanelContent(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String panelcontent)
	{
		getMendixObject().setValue(context, MemberNames.PanelContent.toString(), panelcontent);
	}

	/**
	 * @return value of PanelFooter
	 */
	public final java.lang.String getPanelFooter()
	{
		return getPanelFooter(getContext());
	}

	/**
	 * @param context
	 * @return value of PanelFooter
	 */
	public final java.lang.String getPanelFooter(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.PanelFooter.toString());
	}

	/**
	 * Set value of PanelFooter
	 * @param panelfooter
	 */
	public final void setPanelFooter(java.lang.String panelfooter)
	{
		setPanelFooter(getContext(), panelfooter);
	}

	/**
	 * Set value of PanelFooter
	 * @param context
	 * @param panelfooter
	 */
	public final void setPanelFooter(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String panelfooter)
	{
		getMendixObject().setValue(context, MemberNames.PanelFooter.toString(), panelfooter);
	}

	/**
	 * @return value of Date
	 */
	public final java.util.Date getDate()
	{
		return getDate(getContext());
	}

	/**
	 * @param context
	 * @return value of Date
	 */
	public final java.util.Date getDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Date.toString());
	}

	/**
	 * Set value of Date
	 * @param date
	 */
	public final void setDate(java.util.Date date)
	{
		setDate(getContext(), date);
	}

	/**
	 * Set value of Date
	 * @param context
	 * @param date
	 */
	public final void setDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date date)
	{
		getMendixObject().setValue(context, MemberNames.Date.toString(), date);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return formInputMendixObject;
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
			final bootswatch.proxies.FormInput that = (bootswatch.proxies.FormInput) obj;
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
		return "Bootswatch.FormInput";
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
