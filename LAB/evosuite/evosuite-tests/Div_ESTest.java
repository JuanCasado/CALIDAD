/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 06 12:00:42 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Div_ESTest extends Div_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Div div0 = new Div();
      double double0 = div0.evaluate(0.0, Double.POSITIVE_INFINITY);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Div div0 = new Div();
      double double0 = div0.evaluate((-3590.462572564447), 1995.2452872);
      assertEquals((-1.7995093613793587), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Div div0 = new Div();
      double double0 = div0.evaluate(1.0, 1.0);
      assertEquals(1.0, double0, 0.01);
  }
}