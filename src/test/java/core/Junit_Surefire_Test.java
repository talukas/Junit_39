package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit_Surefire_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test //Ignore
	public void test_01_AssertEquals_Positive() {
	assertEquals("Strings should be equal to each other", "Tanya 18", Junit_Surefire.s);
	}

	@Test //Ignore
	public void test_02_AssertEquals_Negative() {
	assertEquals("Strings not equal to each other", "Tanya 18", Junit_Surefire.s);
	}
	
	@Test @Ignore
	public void test_03_AssertEquals_Ignored() {
	assertEquals("Strings not equal to each other", "Tanya 18", Junit_Surefire.s);
	}
	
	@Test //Ignore
	public void test_04_AssertSame_Positive() {
	assertSame("Integer is same", "345", Junit_Surefire.i);
	}
	
	@Test //Ignore
	public void test_05_AssertSame_Negative() {
	assertSame("Integer not the  same", "345", Junit_Surefire.i);
	}
	
	@Test @Ignore
	public void test_06_AssertSame_Ignore() {
	assertSame("Integer not the  same", "345", Junit_Surefire.i);
	}

	@Test //Ignore
	public void test_07_Assert_True_Positive() {
	assertTrue("Must be true", Junit_Surefire.t);
	}
	
	@Test //Ignore
	public void test_08_Assert_True_Negative() {
	assertTrue("Must be false", Junit_Surefire.f);
	}
	
	@Test //Ignore
	public void test_09_Assert_False_Positive() {
	assertFalse("Must be false", Junit_Surefire.f);
	}
	
	@Test //Ignore
	public void test_10_Assert_False_Negative() {
	assertFalse("Must be true", Junit_Surefire.t);
	}
}
