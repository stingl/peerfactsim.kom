/*
 * Copyright (c) 2005-2011 KOM - Multimedia Communications Lab
 *
 * This file is part of PeerfactSim.KOM.
 * 
 * PeerfactSim.KOM is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * PeerfactSim.KOM is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with PeerfactSim.KOM.  If not, see <http://www.gnu.org/licenses/>.
 *
 */


package de.tud.kom.p2psim.impl.application.filesharing2.operations;

import de.tud.kom.p2psim.api.common.OperationCallback;
import de.tud.kom.p2psim.impl.application.filesharing2.FilesharingApplication;
import de.tud.kom.p2psim.impl.application.filesharing2.operations.periodic.PeriodicCapableOperation;
import de.tud.kom.p2psim.impl.application.filesharing2.overlays.IOverlayHandler;

/**
 * A node looks up a document with a predefined key
 * 
 * @author <peerfact@kom.tu-darmstadt.de>
 * 
 * @version 05/06/2011
 */
public class FSLookupResourceOperation extends
		PeriodicCapableOperation<FilesharingApplication, Object> implements
		FilesharingOperation {

	private final IOverlayHandler ol;

	private int resourceID;

	public FSLookupResourceOperation(IOverlayHandler ol, int resourceID,
			FilesharingApplication component, OperationCallback<Object> callback) {
		super(component, callback);
		this.ol = ol;
		this.resourceID = resourceID;
	}

	@Override
	protected void executeOnce() {
		if (getComponent().getHost().getNetLayer().isOnline())
			ol.lookupResource(resourceID);
	}

	@Override
	public Object getResult() {
		return null;
	}

	public int getLookedUpResourceID() {
		return resourceID;
	}

}
