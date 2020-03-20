/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 19 13:05:10 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Variable variable0 = new Variable();
      double double0 = variable0.evaluate(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Variable variable0 = new Variable();
      double double0 = variable0.evaluate((-832.2486486630702));
      assertEquals((-832.2486486630702), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Variable variable0 = new Variable();
      double double0 = variable0.evaluate(1514.730314022);
      assertEquals(1514.730314022, double0, 0.01);
  }
}