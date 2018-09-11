// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies;

public class Root
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Demo.Root";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Error("Error"),
		Results_Root("Demo.Results_Root");

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

	public Root(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Demo.Root"));
	}

	protected Root(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rootMendixObject)
	{
		if (rootMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Demo.Root", rootMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Demo.Root");

		this.rootMendixObject = rootMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Root.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static demo.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return demo.proxies.Root.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static demo.proxies.Root initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new demo.proxies.Root(context, mendixObject);
	}

	public static demo.proxies.Root load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return demo.proxies.Root.initialize(context, mendixObject);
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
	 * @return value of Error
	 */
	public final java.lang.Boolean getError()
	{
		return getError(getContext());
	}

	/**
	 * @param context
	 * @return value of Error
	 */
	public final java.lang.Boolean getError(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Error.toString());
	}

	/**
	 * Set value of Error
	 * @param error
	 */
	public final void setError(java.lang.Boolean error)
	{
		setError(getContext(), error);
	}

	/**
	 * Set value of Error
	 * @param context
	 * @param error
	 */
	public final void setError(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean error)
	{
		getMendixObject().setValue(context, MemberNames.Error.toString(), error);
	}

	/**
	 * @return value of Results_Root
	 */
	public final demo.proxies.Results getResults_Root() throws com.mendix.core.CoreException
	{
		return getResults_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Results_Root
	 */
	public final demo.proxies.Results getResults_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		demo.proxies.Results result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Results_Root.toString());
		if (identifier != null)
			result = demo.proxies.Results.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Results_Root
	 * @param results_root
	 */
	public final void setResults_Root(demo.proxies.Results results_root)
	{
		setResults_Root(getContext(), results_root);
	}

	/**
	 * Set value of Results_Root
	 * @param context
	 * @param results_root
	 */
	public final void setResults_Root(com.mendix.systemwideinterfaces.core.IContext context, demo.proxies.Results results_root)
	{
		if (results_root == null)
			getMendixObject().setValue(context, MemberNames.Results_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Results_Root.toString(), results_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rootMendixObject;
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
			final demo.proxies.Root that = (demo.proxies.Root) obj;
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
		return "Demo.Root";
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