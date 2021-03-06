/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 06 12:00:14 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Constant_ESTest extends Constant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Constant constant0 = new Constant(0.0);
      double double0 = constant0.evaluate(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Constant constant0 = new Constant(3575.084258);
      double double0 = constant0.evaluate(3575.084258);
      assertEquals(3575.084258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Constant constant0 = new Constant(0.0);
      double double0 = constant0.evaluate();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Constant constant0 = new Constant(3575.084258);
      double double0 = constant0.evaluate();
      assertEquals(3575.084258, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Constant constant0 = new Constant((-667.114546541674));
      double double0 = constant0.evaluate();
      assertEquals((-667.114546541674), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Constant constant0 = new Constant((-667.114546541674));
      double double0 = constant0.evaluate((-667.114546541674));
      assertEquals((-667.114546541674), double0, 0.01);
  }
}
