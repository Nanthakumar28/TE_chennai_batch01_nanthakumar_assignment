package com.te.rectangleandbox;

public class RectangleFinal extends Rectangleimpl{
	
	public RectangleFinal() {
		super(3, 4);
		int res = (2 * super.length) + (2 * super.width);
		System.out.println("The perimeter of rectangle is" +  " " + res);
		int res1 = (super.length * super.width);
		System.out.println("The Area of rectangle is" + " " + res1);
	}

}
