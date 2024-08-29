public class Calculator{
    
        int num1;
        int num2;
        int result;

        void add(){
            result=num1+num2;
            System.out.println("the sum is ="+result);
        }
        void multiply(){
            result=num1*num2;
            System.out.println("the multiply is ="+result);
        }
public static void main(String[]args){
    Calculator cal=new Calculator();
    cal.num1=10;
    cal.num2=20;
    cal.add();
    cal.multiply();
}

    
}