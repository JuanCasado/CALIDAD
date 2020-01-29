import java.lang.Math; 

public class Exp implements Operation {
  public double evaluate (double value1, double value2){
    return Math.pow(value1,value2);
  }
}