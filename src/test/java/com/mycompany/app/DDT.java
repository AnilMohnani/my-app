package com.mycompany.app;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class DDT {

	@Test
	public void validateLogin() throws Exception
	{
		//ExcelDrivenTesting edt=new ExcelDrivenTesting();
		dataDriven dd=new dataDriven();
		ArrayList<String> al=dd.getData("register");
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));

		
	}
}
