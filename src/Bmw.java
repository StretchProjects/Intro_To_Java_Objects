/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Objects
 * Lecture  : http://youtu.be/FDnSoPLcF0c
 * Tutorial : http://youtu.be/XvBGl5ggzBo
 * License  : None.  Do with it as you wish! :)
 */

public class Bmw extends Car {
	public Bmw() {
		name = "Bmw";
		model = "1 series";
		age = 1.5f;
	}
	
	/* Only accessible if you instantiate
	 * as "Bmw", not "Car"
	 */
	public void methodOnlyBmwHas() {
		//do something
	}
}
