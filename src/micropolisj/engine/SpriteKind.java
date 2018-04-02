// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.engine;

/**
 * Enumeration of the various kinds of sprites that may appear in the city.
 */
public enum SpriteKind
{
	TRA(1,5), /*Train*/
	COP(2,8), /*Helicopter*/
	AIR(3,11),/*Airplane*/
	SHI(4,8), /*ship*/
	GOD(5,16),/*Monster*/
	TOR(6,3), /*Tornado*/
	EXP(7,6),/*explode*/
	BUS(8,4); /*Bus*/

	public final int objectId;
	public final int numFrames;

	private SpriteKind(int objectId, int numFrames)
	{
		this.objectId = objectId;
		this.numFrames = numFrames;
	}
}
