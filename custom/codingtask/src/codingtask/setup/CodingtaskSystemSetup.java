/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package codingtask.setup;

import static codingtask.constants.CodingtaskConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import codingtask.constants.CodingtaskConstants;
import codingtask.service.CodingtaskService;


@SystemSetup(extension = CodingtaskConstants.EXTENSIONNAME)
public class CodingtaskSystemSetup
{
	private final CodingtaskService codingtaskService;

	public CodingtaskSystemSetup(final CodingtaskService codingtaskService)
	{
		this.codingtaskService = codingtaskService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		codingtaskService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return CodingtaskSystemSetup.class.getResourceAsStream("/codingtask/sap-hybris-platform.png");
	}
}
