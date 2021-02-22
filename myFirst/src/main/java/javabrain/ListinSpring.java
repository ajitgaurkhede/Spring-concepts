package javabrain;

import java.util.List;

public class ListinSpring {
	
	
	List<Point> pointList;

	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

	@Override
	public String toString() {
		return "ListinSpring [pointList=" + pointList + "]";
	}
	
	
	public void draw() {
		
		System.out.println(pointList);
		
	}
	

}
