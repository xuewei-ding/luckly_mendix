// This file was generated by Mendix Modeler 7.16.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package demo.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Demo module
	public static void callGankService(IContext context, demo.proxies.Pages _pages)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Pages", _pages == null ? null : _pages.getMendixObject());
			Core.execute(context, "Demo.CallGankService", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void clearGank(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "Demo.ClearGank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static demo.proxies.StringParam createMicroFlow(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "Demo.CreateMicroFlow", params);
			return result == null ? null : demo.proxies.StringParam.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String deleteVehicle(IContext context, java.lang.Long _vehicleID)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("vehicleID", _vehicleID);
			return (java.lang.String)Core.execute(context, "Demo.DeleteVehicle", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<demo.proxies.Vehicle> getVehicles(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "Demo.GetVehicles", params);
			java.util.List<demo.proxies.Vehicle> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<demo.proxies.Vehicle>();
				for (IMendixObject obj : objs)
					result.add(demo.proxies.Vehicle.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void pieChartTestMF(IContext context, widgets.proxies.StringParam _stringParam)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringParam", _stringParam == null ? null : _stringParam.getMendixObject());
			Core.execute(context, "Demo.PieChartTestMF", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String postVehicle(IContext context, system.proxies.HttpRequest _httpRequest, system.proxies.HttpResponse _httpResponse, java.util.List<demo.proxies.Vehicle> _vehicleList)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
			params.put("httpResponse", _httpResponse == null ? null : _httpResponse.getMendixObject());
			java.util.ArrayList<IMendixObject> listparam_vehicleList = null;
			if (_vehicleList != null)
			{
				listparam_vehicleList = new java.util.ArrayList<IMendixObject>();
				for (demo.proxies.Vehicle obj : _vehicleList)
					listparam_vehicleList.add(obj.getMendixObject());
			}
			params.put("VehicleList", listparam_vehicleList);
			return (java.lang.String)Core.execute(context, "Demo.PostVehicle", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}