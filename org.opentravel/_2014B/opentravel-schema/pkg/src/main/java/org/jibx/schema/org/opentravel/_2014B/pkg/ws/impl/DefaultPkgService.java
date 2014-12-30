package org.jibx.schema.org.opentravel._2014B.pkg.ws.impl;

import org.jibx.schema.org.opentravel._2014B.pkg.ws.*;
import org.jibx.schema.org.opentravel._2014B.pkg.*;
import org.jibx.schema.org.opentravel._2014B.base.ws.*;
import org.joda.time.DateTime;

/**
 * Skeleton hotel service implementation.
 * @author don
 *
 */
public abstract class DefaultPkgService extends BaseService
	implements PkgService
{

	/**
	 * Constructor
	 */
	public DefaultPkgService()
	{
		super();
	}

	/**
	 * Constructor
	 */
	public void init()
	{
		super.init();
	}

	/**
	 * Service the xyz request.
	 * You should override this method.
	 * @param request
	 * @return
	 */
	/* TODO public XyzRS xyz(XyzRQ request) {
		
		PingRS response = new PingRS();
		response.setPayloadStdAttributes(createStandardPayload());
		movePayloadData(request.getPayloadStdAttributes(), response.getPayloadStdAttributes());
		
		Errors errors = addError(null, "Error, ping method not implemented", null);
		response.setErrors(errors);
		return response;
	}*/

}
