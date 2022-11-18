import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            boolean sair = false;

            System.out.println("Introduce unha operacion tal que (a b *)");
            String linea = sc.nextLine().trim();

            do{
            if (linea.length()!= 5){
                System.out.println("Valores incorrectos, volveo a intentar :");
                linea = sc.nextLine().trim();
            }else{
                sair =true;
            }
        }while(sair != true);
        
        int a = Character.getNumericValue(linea.charAt(0));
        int b = Character.getNumericValue(linea.charAt(2));
    
        char c = linea.charAt(4);
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '*':
            System.out.println(a*b);
                break;

            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);

            default:
                System.out.println("O símbolo introducido non é válido");
                break;
        }
       
            //facelo con array que elimine whitespaces
        
    }
}
