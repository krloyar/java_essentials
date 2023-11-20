public class Swap {
    
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        
        System.out.println("Values before swap: ");
        System.out.println("n1: " +n1 + " n2: "+n2);

        int vada = n1;
        n1 = n2;
        n2 = vada;

        System.out.println("Values after swap: ");
        System.out.println("n1: " +n1 + " n2: "+n2);

    }
}
