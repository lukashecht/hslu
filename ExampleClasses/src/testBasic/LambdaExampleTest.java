package testBasic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basic.LambdaExample;

public class LambdaExampleTest {
	private LambdaExample _lambda;
	
	@Before
	public void setUp() {
		_lambda = new LambdaExample();
	}

	@Test
	public void test() {
		
		_lambda.run();
	}

}
