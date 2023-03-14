public class App {
    public static int Fatorial(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n * Fatorial(n - 1);
    }

    public static int Somatorio(int n){
        if (n == 0){
            return 0;
        }
        if (n > 0){
            return n + Somatorio(n - 1);
        }
        return n + Somatorio(n + 1);
    }

    public static int Fibonnaci(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fibonnaci(n) + Fibonnaci(n + 1);  
    }

    public static int Somatorio2(int x, int y){
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println("o fatorial de "+n+" é: "+Fatorial(n));
        System.out.println("o somatorio de "+n+" é: "+Somatorio(n));
        //System.out.println(Fibonnaci(n));
        //System.out.println(Somatorio2(3, 3));
    }
}