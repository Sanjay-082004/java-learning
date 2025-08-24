public class Calc {
    public static void main(String[] args) {
        int a=3;
        int b=1;
        char operators = '%';
        switch (operators){
            case '+' :
               int result = a+b;
                System.out.println(result);
                break;
            case '-':
             result = a-b;
                System.out.println(result);
                break;
            case '/':
                result=a/b;
                System.out.println(result);
                break;
            case '*':
                result = a*b;
                System.out.println(result);
                break;
            default:
                System.out.println(a%b );

        }
    }
}
