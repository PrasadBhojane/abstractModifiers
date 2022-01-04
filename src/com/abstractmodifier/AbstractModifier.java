package com.abstractmodifier;

abstract class Vehicle {
	
	abstract public int getNoofwheels();
	}
class Bus extends Vehicle {
	
	public int getNoofwheels() 
	{
		return 7;
	}
}