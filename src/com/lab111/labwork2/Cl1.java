package com.lab111.labwork2;

public class Cl1 implements If1 {
	/**
	 * field for If1 type
	 */
	Cl1 c11;

	/**
	 * Method that prints name of class and method
	 */

	@Override
	public void meth1() {
		System.out.println("Cl1 -- meth1");
	}

	/**
	 * method is extended from interface if2 by if1
	 * show information in console about class and method
	 */
	@Override
	public void meth2() {
		System.out.println("Cl2 -- meth2");
	}
}
