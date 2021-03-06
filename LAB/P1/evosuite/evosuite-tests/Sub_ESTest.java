/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 19 13:02:36 GMT 2020
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
      double double0 = sub0.evaluate(0.0, (-1822.465857));
      assertEquals(1822.465857, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sub sub0 = new Sub();
      double double0 = sub0.evaluate(0.0, 1344.56823);
      assertEquals((-1344.56823), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sub sub0 = new Sub();
      double double0 = sub0.evaluate((-1721.3682), (-1721.3682));
      assertEquals(0.0, double0, 0.01);
  }
}
