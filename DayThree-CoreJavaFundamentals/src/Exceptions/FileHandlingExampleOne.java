package Exceptions;

import java.io.*;

public class FileHandlingExampleOne {

	public static void main(String[] args) throws IOException {
		
		/*
		 * FileWriter writer = null; try { writer = new FileWriter("d://demo.txt");
		 * writer.write("Lets Learn File Handling.");
		 * System.out.println("Content written to the file successfully."); } catch
		 * (IOException e) { System.out.println(e.getMessage()); } finally {
		 * writer.close(); }
		 */
		
		FileWriter writer =new FileWriter("d://demo.txt");
		writer.write("Something");
		writer.close();
		
	}
	
}
