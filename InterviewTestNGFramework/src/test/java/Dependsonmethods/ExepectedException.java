package Dependsonmethods;
import java.io.IOException;

import org.testng.annotations.Test;

public class ExepectedException
{
	@Test(expectedExceptions = { IOException.class })          //Passes
	public void exceptionTestOne() throws Exception {
		throw new IOException();
	}

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })      //Fails
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}
}