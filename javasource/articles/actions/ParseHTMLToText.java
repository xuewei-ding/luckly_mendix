// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package articles.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ParseHTMLToText extends CustomJavaAction<java.lang.String>
{
	private java.lang.String html;

	public ParseHTMLToText(IContext context, java.lang.String html)
	{
		super(context);
		this.html = html;
	}

	@Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		//throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		return Html2Text.getContent(html);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "ParseHTMLToText";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
