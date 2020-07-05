package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailedTestRerun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNG runner=new TestNG();
		List<String> list=new ArrayList<String>();
		
		list.add("C:\\Users\\AnilY\\my-app\\test-output\\Reg Suite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
		
	}

}
