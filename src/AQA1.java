import java.security.spec.RSAOtherPrimeInfo;

public class AQA1 {
    
    public static void main (String args []) {
        System.out.println("Summer 2021");
     
        
        int a = 1; 
        boolean b = true;
        long c = 500000000;
        double d = 1.12345;
        String g = "SomeString";

        System.out.println(a);
        System.out.println(g); 
        
        double j = 2.13;
        
       a = (int) j;

        System.out.println(a);
        
        //Переменные
        double param1 = 2;
        double param2 = 53333;
        double delete = param2 / param1;
        double delete2 = param1 / param2;

        System.out.println(delete2); 
        
        int increment = 0;
        System.out.println(increment);
        increment++; 
        System.out.println(increment);
        
        increment++;
        System.out.println(increment);

        increment++;
        System.out.println(increment);
        
        //>
        //<
        //==
        //!=
        //<=
        //>=
        
        
        //Условные операторы
        int number = 0;
        if (number<0) {
            System.out.println("Отриц");
        }
        if (number>0) {
            System.out.println("Положит");
        }
        if (number==0) {
            System.out.println("0");
        }
    }
        
//    {if (number > 0) {
//        System.out.println("Положит") }
//        
//                else { System.out.println("Отриц")
//    }
}
