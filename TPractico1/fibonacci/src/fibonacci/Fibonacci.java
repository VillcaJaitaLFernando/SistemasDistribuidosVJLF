package fibonacci;
import java.util.Scanner;

/**
 *
 * @author LinoFernandoVillcaJaita
 */
public class Fibonacci {
   
    public static void main(String[] args) {
        int numero, fibo1 = 0, fibo2=1, suma=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del numero que quiere saber su Fibonacci: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.print(suma+" - ");
            suma = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = suma;
        }
        
        System.out.println("\n El Fibonacci de "+numero+" es: "+fibo1);
    }
    
}
