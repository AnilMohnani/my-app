package com.mycompany.app;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {

	public static void main(String[] args) {

		ITesseract image=new Tesseract();
		image.setTessVariable("user_defined_dpi", "70");

		try {
			String imageText=image.doOCR(new File("D:\\captca.png"));
			//System.out.println(imageText);
			String[] str= imageText.split(" ");
			System.out.println(str[1].trim());
			
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());		}
		
	}

}
