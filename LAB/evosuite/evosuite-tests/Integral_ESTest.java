/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 06 12:01:16 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Integral_ESTest extends Integral_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integral integral0 = new Integral(0.0, 0.0, 198.35);
      Constant constant0 = new Constant(198.35);
      double double0 = integral0.integrate(constant0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integral integral0 = new Integral((-2481.8312171123894), 2526.974073787746, 748.95017142);
      Variable variable0 = new Variable();
      Mul mul0 = new Mul();
      Function function0 = new Function(mul0, variable0, variable0);
      double double0 = integral0.integrate(function0);
      assertEquals(1.2052442867428684E10, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integral integral0 = new Integral((-890.485040130813), 5980.38525891108, (-890.485040130813));
      Constant constant0 = new Constant(0.0);
      // Undeclared exception!
      integral0.integrate(constant0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integral integral0 = new Integral(1.0, 1156.0, 1.0);
      // Undeclared exception!
      try { 
        integral0.integrate((Expresion) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Integral", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integral integral0 = new Integral((-2481.8312171123894), 2526.974073787746, 748.95017142);
      Variable variable0 = new Variable();
      double double0 = integral0.integrate(variable0);
      assertEquals((-1231921.8637718242), double0, 0.01);
  }
}
