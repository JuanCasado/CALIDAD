/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 19 13:03:52 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Function_ESTest extends Function_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sub sub0 = new Sub();
      Constant constant0 = new Constant(0.0);
      Variable variable0 = new Variable();
      Function function0 = new Function(sub0, constant0, variable0);
      double double0 = function0.evaluate(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sub sub0 = new Sub();
      Constant constant0 = new Constant(0.0);
      Variable variable0 = new Variable();
      Function function0 = new Function(sub0, constant0, variable0);
      double double0 = function0.evaluate((-1.0));
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sub sub0 = new Sub();
      Constant constant0 = new Constant(0.0);
      Variable variable0 = new Variable();
      Function function0 = new Function(sub0, constant0, variable0);
      double double0 = function0.evaluate(4253.60812);
      assertEquals((-4253.60812), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Div div0 = new Div();
      Function function0 = new Function(div0, (Expresion) null, (Expresion) null);
      // Undeclared exception!
      try { 
        function0.evaluate(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Function", e);
      }
  }
}
