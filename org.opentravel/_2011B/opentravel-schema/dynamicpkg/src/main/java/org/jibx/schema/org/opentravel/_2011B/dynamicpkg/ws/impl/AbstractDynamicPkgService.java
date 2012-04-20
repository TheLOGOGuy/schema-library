package org.jibx.schema.org.opentravel._2011B.dynamicpkg.ws.impl;

import org.jibx.schema.org.opentravel._2011B.dynamicpkg.ws.*;
import org.jibx.schema.org.opentravel._2011B.dynamicpkg.*;
import org.jibx.schema.org.opentravel._2011B.base.ws.*;
import org.joda.time.DateTime;

/**
 * Skeleton DynamicPkg service implementation.
 * @author don
 *
 */
public abstract class AbstractDynamicPkgService extends BaseService
	implements DynamicPkgService
{

	/**
	 * Constructor
	 */
	public AbstractDynamicPkgService()
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
