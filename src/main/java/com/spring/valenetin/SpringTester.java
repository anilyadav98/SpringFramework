package com.spring.valenetin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.valenetin.entity.ValentineEntity;

public class SpringTester 
{
	public static void main(String[] args)
	{
		try
		{
			ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");
			
			ValentineEntity entity = new ValentineEntity();
			entity.setId(1);
			entity.setName("eswer");
			entity.setStatus("double");
			entity.setGift("ring");
			entity.setAmmountSpent(420);
			
			System.out.println(entity);

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
