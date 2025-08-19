public class Empbonus {
    public static void main(String[] args) {
        double salary = 20000;
        int years = 4;
        double bonus;
        if(years>5){
            bonus = salary * 10/100;
        }else{
            bonus = salary * 5/100;
        }
        System.out.println(bonus);
    }
}
