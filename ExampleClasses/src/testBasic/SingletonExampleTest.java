package testBasic;

import static org.junit.Assert.*;


import org.junit.Test;

import basic.SingletonExample;

public class SingletonExampleTest {	

	@Test
	public void getNextNumber_ReturnsAdditonalNextNumber() {
		int expectedNumber = 1000;
		assertEquals("Next number is " + expectedNumber, SingletonExample.getInstance().getNextNumber());
		expectedNumber++;
		assertEquals("Next number is " + expectedNumber, SingletonExample.getInstance().getNextNumber());
		expectedNumber++;
		assertEquals("Next number is " + expectedNumber, SingletonExample.getInstance().getNextNumber());
		expectedNumber++;
		assertEquals("Next number is " + expectedNumber, SingletonExample.getInstance().getNextNumber());
	}
}
