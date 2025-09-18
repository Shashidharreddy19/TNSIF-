package com.tnsif.abstraction;

public abstract class shape {

	protected float area;
	abstract void calarea();
	public void show()
	{
		System.out.println("the area of shape is "+ area);
	}

}
