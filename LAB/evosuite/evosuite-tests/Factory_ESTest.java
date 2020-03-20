/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 06 12:03:51 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Factory_ESTest extends Factory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Factory factory0 = new Factory();
      Operation operation0 = factory0.o('^');
      assertNotNull(operation0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Factory factory0 = new Factory();
      Operation operation0 = factory0.o('/');
      assertNotNull(operation0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Factory factory0 = new Factory();
      Operation operation0 = factory0.o('-');
      assertNotNull(operation0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Factory factory0 = new Factory();
      Operation operation0 = factory0.o('+');
      assertNotNull(operation0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Factory factory0 = new Factory();
      Operation operation0 = factory0.o('t');
      assertNull(operation0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Factory factory0 = new Factory();
      Expresion expresion0 = factory0.x();
      Constant constant0 = (Constant)factory0.c('t');
      Mul mul0 = (Mul)factory0.o('*');
      assertNotNull(mul0);
      
      factory0.f(mul0, expresion0, constant0);
      assertEquals(116.0, constant0.evaluate(), 0.01);
  }
}