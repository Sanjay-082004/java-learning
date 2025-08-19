public class Atm {
    public static void main(String[] args) {
        int balance = 1000;
        int amount = 200;
        if(amount<=balance && amount>0){
            System.out.println("withdraw sucessfull");
        }else {
            System.out.println("invailid transaction");
        }

    }
}
