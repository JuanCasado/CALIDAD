/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 06 12:00:21 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sub_ESTest extends Sub_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sub sub0 = new Sub();
      double double0 = sub0.evaluate(1.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sub sub0 = new Sub();
      double double0 = sub0.evaluate((-1803.1838035397063), 0.0);
      assertEquals((-1803.1838035397063), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sub sub0 = new Sub();
      double double0 = sub0.evaluate(1.0, 0.0);
      assertEquals(1.0, double0, 0.01);
  }
}
