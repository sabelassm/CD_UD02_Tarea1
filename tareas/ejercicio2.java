public class ejercicio2
{
    public static void main(String[] args) 
    {
        if(args.length==0){
            String[] nombres ={"Ana", "Carlos", "Jose", "Mason"};
            imprimeNombres(nombres);
        }
        else{
            imprimeNombres(args);
        }
    }
    private static void imprimeNombres(String[] nombres)
    {
        System.out.print("Hola ");
        
        for(int i=0; i<nombres.length; i++) 
        {
            if(i>0)
                System.out.print(", ");
            System.out.print(nombres[i]);                
        }
        System.out.println("!");
    }
}