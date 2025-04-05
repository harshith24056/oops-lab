class Display Overloading
  public int add(int a, int b)
  {
    int sum = a+b;
    return sum;
  }
  public float add(float a, float b)
  {
    float sum = a+b;
    return sum;
  }

}
class JavaExample
{
  public static void main(String args[])
  {
    DisplayOverloading2 obj = new DisplayOverloading2();
    
    System.out.println(obj.add(5, 15));
            System.out.println(obj.add(5.5f, 2.5f));

  }

} 
