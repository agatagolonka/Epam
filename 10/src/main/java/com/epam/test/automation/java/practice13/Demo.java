package com.epam.test.automation.java.practice13;

import com.epam.test.automation.java.practice13.part1.Part1;
import com.epam.test.automation.java.practice13.part2.Part2;
import com.epam.test.automation.java.practice13.part3.Part3;
import com.epam.test.automation.java.practice13.part4.Part4;
import com.epam.test.automation.java.practice13.part5.Part5;
import com.epam.test.automation.java.practice13.part6.Part6;

public class Demo {

	private static final String DELIMITER = "~~~~~~";

	private static final String INPUT = "--input";

	private static final String FILE_NAME = "part6.txt";

	private static final String TASK = "--task";

	public static void main(String[] args) {
		System.out.println("=========================== PART1");
		Part1.main(null);
		System.out.println("=========================== PART2");
		Part2.main(null);
		System.out.println("=========================== PART3");
		Part3.main(null);
		System.out.println("=========================== PART4");
		Part4.main(null);
		System.out.println("=========================== PART5");
		Part5.main(null);
		System.out.println("=========================== PART6");
		Part6.main(new String[] {INPUT, FILE_NAME, TASK,
				"frequency"});
		System.out.println(DELIMITER);
		Part6.main(new String[] {INPUT, FILE_NAME, TASK,
				"length"});
		System.out.println(DELIMITER);
		Part6.main(new String[] {INPUT, FILE_NAME, TASK,
				"duplicates"});
		System.out.println(DELIMITER);
	}

}
