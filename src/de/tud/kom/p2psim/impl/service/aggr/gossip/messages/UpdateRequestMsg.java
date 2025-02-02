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


package de.tud.kom.p2psim.impl.service.aggr.gossip.messages;

import java.util.List;

import de.tud.kom.p2psim.api.common.Message;
import de.tud.kom.p2psim.impl.service.aggr.gossip.UpdateInfo;
import de.tud.kom.p2psim.impl.service.aggr.gossip.UpdateInfoNodeCount;
import de.tud.kom.p2psim.impl.util.Tuple;

/**
 * Message that carries the current update aggregation values to neighbors and
 * in turn requests the neighbors to respond with their own values.
 * 
 * @author Leo Nobach <peerfact@kom.tu-darmstadt.de>
 * 
 * @version 05/06/2011
 */
public class UpdateRequestMsg extends AbstractUpdateMsg {

	public UpdateRequestMsg(long epoch,
			List<Tuple<Object, UpdateInfo>> payloadInfo,
			UpdateInfoNodeCount payloadNC) {
		super(epoch, payloadInfo, payloadNC);
	}

	@Override
	public Message getPayload() {
		return this;
	}

}
