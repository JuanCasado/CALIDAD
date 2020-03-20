/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 19 13:02:45 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Exp_ESTest extends Exp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Exp exp0 = new Exp();
      double double0 = exp0.evaluate(Double.POSITIVE_INFINITY, (-2319.91729));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Exp exp0 = new Exp();
      double double0 = exp0.evaluate((-1.0), 1.0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Exp exp0 = new Exp();
      double double0 = exp0.evaluate(0.0, (-1.0));
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }
}