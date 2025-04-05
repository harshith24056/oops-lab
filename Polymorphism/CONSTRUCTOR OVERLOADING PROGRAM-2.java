class Method_Overloading {
    double figure(double l, int b) 
    {
        return (l*b);
    }
    float figure(int s) 
    {
        return (s*s);
    }
    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        System.out.println("Area of Rectangle: " +obj.figure(5.55, 6)); 

        System.out.println("Area of Square: " +obj.figure(3)); 
    }
} 
