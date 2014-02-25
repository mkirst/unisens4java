/*
Unisens Library - library for a universal sensor data format
Copyright (C) 2008 FZI Research Center for Information Technology, Germany
                   Institute for Information Processing Technology (ITIV),
				   KIT, Germany

This file is part of the Unisens Library. For more information, see
<http://www.unisens.org>

The Unisens Library is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

The Unisens Library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with the Unisens Library. If not, see <http://www.gnu.org/licenses/>. 
*/

package org.unisens.ri.io;

import java.io.IOException;

import org.unisens.DataType;
import org.unisens.SignalEntry;

public abstract class SignalWriter extends AbstractWriter{
	protected SignalEntry signalEntry = null;
	protected DataType dataType;
	protected int channelCount = 0;
	
	public SignalWriter(SignalEntry signalEntry){
		super(signalEntry);
		this.signalEntry = signalEntry;
		this.dataType = signalEntry.getDataType();
		this.channelCount = signalEntry.getChannelCount();
	}
	public abstract void append(Object data) throws IOException;
}
