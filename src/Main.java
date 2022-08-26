public class Main {
    public static void main(String[] args) {
        boolean paistaa = true;
        int time = 17;

        if(paistaa && time >= 10 && time <= 16)
        {
            System.out.println("Please use sunscreen");
        }
        else {
            System.out.println("No need for sunscreen");
        }
    }
}