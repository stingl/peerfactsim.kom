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


package de.tud.kom.p2psim.impl.network.modular.st.packetSizing;

import de.tud.kom.p2psim.api.common.Message;
import de.tud.kom.p2psim.api.network.NetID;
import de.tud.kom.p2psim.api.network.NetProtocol;
import de.tud.kom.p2psim.impl.network.modular.st.PacketSizingStrategy;

/**
 * Returns the packet length that is equal to the payload length (no header at all).
 * @author Leo Nobach <peerfact@kom.tu-darmstadt.de>
 *
 * @version 05/06/2011
 */
public class NoHeader implements PacketSizingStrategy {

	@Override
	public long getPacketSize(Message payload, NetID receiver, NetID sender,
			NetProtocol netProtocol, int noOfFragments) {
		return payload.getSize();
	}

	@Override
	public void writeBackToXML(BackWriter bw) {
		//No simple/complex types to write back
	}

}
