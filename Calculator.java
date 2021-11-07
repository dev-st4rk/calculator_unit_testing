public class Calculator {

    public static int add(int num1, int num2)
    {
        return num1+num2;
    }

    public static int sub(int num1, int num2)
    {
        return num1-num2;
    }

    public static int mult(int num1,int num2)
    {
        return num1*num2;
    }

    public static float div(int num1,int num2)
    {
        if (num2 != 0) {
            return num1/num2;
        }
        else{
            System.out.println("Ta tentando fazer divisão por zero amigão? kkk");
            return -1;
        }
    }


}
