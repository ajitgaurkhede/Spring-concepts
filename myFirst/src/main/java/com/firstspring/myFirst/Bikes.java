package com.firstspring.myFirst;

import org.springframework.stereotype.Component;

@Component
public class Bikes implements Vehical {
	
	public void drive() {
		
		System.out.println("bike is running...");
	}
	
	
	
	/*<bean id ="tyre" class = "com.firstspring.myFirst.Tyre">
<property name = "brand" value = "MRF"></property>
</bean>
*/
	


}
