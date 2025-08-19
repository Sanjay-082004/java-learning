public class Traffic {
    public static void main(String[] args) {
        String colour = "green";
        if(colour.equalsIgnoreCase("red")){
            System.out.println("stop");
        } else if (colour.equalsIgnoreCase("yellow")) {
            System.out.println("wait");
        } else if (colour.equalsIgnoreCase("green")) {
            System.out.println("go");

        }else {
            System.out.println("invalid colour");
        }

    }
}
