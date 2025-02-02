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



package de.tud.kom.p2psim.api.transport;

/**
 * Instances of this type describe the service properties chosen for message
 * transmission.
 * 
 * @author Sebastian Kaune <peerfact@kom.tu-darmstadt.de>
 * @author Konstantin Pussep
 * @version 3.0, 11/29/2007
 * 
 */
public enum TransProtocol {
	/**
	 * User Datagram Protocol
	 */
	UDP(false, false),
	/**
	 * Transmission Control Protocol
	 */
	TCP(true, true);

	private boolean isConOriented;

	private boolean isReliable;

	private TransProtocol(boolean isConOriented, boolean isReliable) {
		this.isConOriented = isConOriented;
		this.isReliable = isReliable;
	}

	/**
	 * If the used service is connection-oriented the in-order delivery of
	 * messages is guaranteed.
	 * 
	 * @return whether the applied service should be connection-oriented
	 */
	public boolean isConnectionOriented() {
		return this.isConOriented;
	}

	/**
	 * Whether the used connection is reliable, i.e. the network wrapper tries
	 * to deliver the message in case of loss or and if the message cannot be
	 * delivered an exception is reported to the upper layer.
	 * 
	 * @return whether the applied service should be reliable
	 */
	public boolean isReliable() {
		return this.isReliable;
	}

}
