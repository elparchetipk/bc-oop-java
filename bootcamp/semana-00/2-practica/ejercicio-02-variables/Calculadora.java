import java.util.Scanner;

/**
 * Calculadora básica con las 4 operaciones fundamentales
 * 
 * @author [Tu Nombre]
 * @version 1.0
 */
public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA ===\n");
        
        // TODO: Solicitar primer número
        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();
        
        // TODO: Solicitar segundo número
        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();
        
        // TODO: Realizar operaciones
        System.out.println("\n--- RESULTADOS ---");
        
        // Suma
        double suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
        
        // Resta
        double resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resta);
        
        // Multiplicación
        double multiplicacion = num1 * num2;
        System.out.println(num1 + " × " + num2 + " = " + multiplicacion);
        
        // División (validar división por cero)
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.printf("%.2f ÷ %.2f = %.2f\n", num1, num2, division);
        } else {
            System.out.println("Error: No se puede dividir por cero");
        }
        
        sc.close();
    }
}


  
    

    

    
    
    

    
    
    

    
    

    
    
    

    
    
    

    
    
    

    
    
      
      
    
      
    

    
  