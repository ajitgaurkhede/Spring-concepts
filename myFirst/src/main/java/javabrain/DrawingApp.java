package javabrain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		// Triangle triangle = new Triangle();
		
		
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("brain.xml"));
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("javabrain/javaBrain.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrain/javaBrain.xml");

		/*Triangle t2 = (Triangle) context.getBean("myTriangle");

		t2.draw();*/
		
		/*System.out.println("---------------\n-- List---------------------\n");
		ListinSpring t3 = (ListinSpring) context.getBean("myList");

		t3.draw();*/
		
		
		//Point tt =  (Point) context.getBean("zeroPoint");

		//System.out.println(tt);
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

	}

}
