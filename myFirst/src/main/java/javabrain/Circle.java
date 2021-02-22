package javabrain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//import org.springframework.beans.factory.annotation.Required;

//@Component
public class Circle implements Shape {
	
	private Point center;

	
	public void draw() {
		
		System.out.println("this is circle drawing...");
		System.out.println(center);
	}


	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}


	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelate")
	public void setCenter(Point center) {
		this.center = center;
	}

	
}
