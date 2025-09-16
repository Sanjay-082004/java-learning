public class Vote {
    public static void main(String[] args) {
        Members eligible = new Members();

        System.out.println("_______________________________");
        System.out.println("Eligible Members");
        System.out.println("_______________________________");
        if(eligible.father>=18 && eligible.mother>=18 && eligible.brother>=18 && eligible.sister>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
