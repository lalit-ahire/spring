package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sim.Sim;

public class RelianceMobile {
	
   ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	
	private Sim r=context.getBean(Sim.class);
	
	public RelianceMobile()
	{
	     startMobile();
	     r.startSim();
		
	}
	
	public void startMobile()
	{
		System.out.println("welcome to reliance mobile");
	}

}