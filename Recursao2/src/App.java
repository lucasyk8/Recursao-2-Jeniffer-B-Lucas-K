import java.util.*;
import java.*;

public class App {
    public static int Fatorial(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fatorial(n) * Fatorial(n - 1);
    }

    public static int Somatoria(int n){
        //tem condição de erro?
        //tem condição especial?
        //condição base pra recursão
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

    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println(Fatorial(n));
        System.out.println(Somatoria(n));
        System.out.println(Fibonnaci(n));
    }
}
