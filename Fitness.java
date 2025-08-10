 class Fitness{
    public static void main(String[] args) {
        String userName = "Kavya";
        int stepsWalked = 8500;
        double caloriesPerStep = 0.04;
        double totalCalories = stepsWalked * caloriesPerStep;

        System.out.println("User: " + userName);
        System.out.println("Steps Walked: " + stepsWalked);
        System.out.println("Calories Burned: " + totalCalories);
    }
}