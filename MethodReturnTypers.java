public class MethodReturnTypers {
    public static int returnThree() {
        return 3;
    }
    public static void main(String[] args) {
        int num = returnThree();

        System.out.println("Method returns the number " + num);
    }
    public class booleanMethod {

        public static boolean isEven(int mynumber)
        {
            return (mynumber % 2 == 0);
        }

        public static void main(String[] args)
        {
            int mynumber = 130;
            if(isEven(mynumber) == true)
                System.out.print("Even Number");
            else
                System.out.print("Odd Number");
        }
        
    }
    
}
