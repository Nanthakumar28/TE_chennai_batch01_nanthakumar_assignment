package com.te.rectangleandbox;

public class SquareFinal extends Squareimpl{
	
	public SquareFinal() {
		super(4);
		int res = super.side * super.side;
		System.out.println("The Area of box" + " " + res);
		int res1 = super.side * 4;
		System.out.println("The Perimeter of box "+ " " + res1);
	}

}
