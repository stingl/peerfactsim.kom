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


package de.tud.kom.p2psim.impl.analyzer.csvevaluation.derived.lib;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import de.tud.kom.p2psim.impl.util.toolkits.NumberFormatToolkit;

/**
 *
 * @author <peerfact@kom.tu-darmstadt.de>
 * @version 05/06/2011
 *
 */
public class Printer {

	private IResultStream s;

	public Printer(IResultStream s) {
		this.s = s;
	}

	public void print(File f) throws IOException {
		IResultField field = s.getNextField();
		BufferedWriter w = new BufferedWriter(new FileWriter(f));

		w
				.write("#X 	" + field.getYVals().printCaptionForFile()
						+ "	#values \n");

		while (field != null) {

			IYValueSet yVals = field.getYVals();

			w.write(NumberFormatToolkit.floorToDecimalsString(field.getX(), 0)
					+ " 	" + yVals.printForFile() + "	"
					+ yVals.getNumberOfValues() + "\n");
			field = s.getNextField();
		}

		w.close();
	}

}
