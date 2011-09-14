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


package de.tud.kom.p2psim.impl.vis.analyzer;

import de.tud.kom.p2psim.api.overlay.OverlayNode;
import de.tud.kom.p2psim.impl.overlay.BootstrapManager;

/**
 * Ein OverlayAdapter, der es ermöglicht das Netzwerk zu gruppieren nach
 * Bootstrap-Managern, die die Knoten benötigen nach BootstrapManager-Gruppen
 * 
 * @author Konstantin Pussep <peerfact@kom.tu-darmstadt.de>
 * @author Sebastian Kaune
 * @version 3.0, 07.11.2008
 * 
 */
public interface MultiBootstrapCapable {

	/**
	 * Gibt den BootstrapManager zurück, denn node benutzt.
	 * 
	 * @param node
	 * @return
	 */
	public BootstrapManager getBootstrapManagerFor(OverlayNode node);

}
