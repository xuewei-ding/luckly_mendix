// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package demo.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.core.Core;
import java.util.List;

public class QueryAllDataDemo extends CustomJavaAction<java.util.List<IMendixObject>>
{
	public QueryAllDataDemo(IContext context)
	{
		super(context);
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		// BEGIN USER CODE
		List<IMendixObject> list=Core.retrieveXPathQuery(getContext(),"//Demo.User");
		return list;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "QueryAllDataDemo";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
