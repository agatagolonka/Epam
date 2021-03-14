package com.epam.test.automation.java.practice13.part1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.epam.test.automation.java.practice13.Util;

public class Part1 {

	public static final String TEST_STRING = "Hello world!"
			+ System.lineSeparator() + "34 57632 2342 234?"
			+ System.lineSeparator() + "Time to ff e3e e e ff ff stop it!"
			+ System.lineSeparator();

	public static void main(String[] args) {
		InputStream stIn = System.in;
		try (ByteArrayInputStream byteIn = new ByteArrayInputStream(
				TEST_STRING.getBytes(Util.ENCODING))) {
			System.setIn(byteIn);

			WordContainer.main(null);
			System.setIn(stIn);
		} catch (IOException e) {
			e.printStackTrace();//NOSONAR
		}
	}

}
