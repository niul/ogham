package com.niulbird.ogham;

import java.io.PrintStream;

import org.junit.Test;
import static org.junit.Assert.*;

public class OghamTest {

	@Test
	public void simpleTest() {
		try {
			PrintStream ps = new PrintStream(System.out, true, "UTF-8");
			
			String result1 = new String();
			char[] unicodeArray = {'\u1689', '\u1694', '\u1682', '\u1682', '\u1694', '\u1690', '\u1685'};
		
			for (char unicode : unicodeArray)
				result1 = result1.concat(StringUtil.unicodeToString(unicode));
		
			ps.println("simpleTest: [" + result1 + "]");

			assertTrue(true);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			assertTrue(false);
		}
		
	}
	
	@Test
	public void oghamTest() {
		try {
			PrintStream ps = new PrintStream(System.out, true, "UTF-8");
			
			String input = "supercalifragilisticexpialidocious";
		
			String result1 = Ogham.getOgham(input);
			ps.println(input +": [" + result1 + "]");

			assertTrue(true);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
			assertTrue(false);
		}
		
	}
		
	public static void main(String[] args) {
		OghamTest test = new OghamTest();
		test.simpleTest();
		test.oghamTest();
	}
	
}
