public class Swap1 {
    
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        
        System.out.println("Values before swap: ");
        System.out.println("n1: " +n1 + " n2: "+n2);

        n1 = n1 + n2; // 10 + 20
        n2 = n1 - n2; // 30 - 20 = 10
        n1 = n1 - n2; // 30 - 10 = 20

        System.out.println("Values after swap: ");
        System.out.println("n1: " +n1 + " n2: "+n2);

    }
}
