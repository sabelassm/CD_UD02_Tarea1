import java.util.Scanner;

public class Horoscopo{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opciones = " ";
    do{
        System.out.println("Bienvenido al horoscopo");
        System.out.println("Introduzca su dia de nacimiento: ");
        int dia=entrada.nextInt();

        System.out.println("ahora introduzca su mes de nacimiento: ");
        int mes=entrada.nextInt();

        String signo= DeterminarSigno(dia,mes);
        System.out.println("Tu signo del zodiaco es: " + signo);
        String mensaje=MensajeHoroscopo(signo);
        System.out.println("Tu mensaje de horoscopo de hoy es: " + mensaje);

        System.out.println("¿Quieres consultar otro horoscopo? s/n");
        

  
        opciones=entrada.nextLine();

    }
    while(!opciones.equalsIgnoreCase("s")){
        System.out.println("Gracias por haber utilizado el horoscopo.");

        entrada.close();

    }
    




     

    }
    


        private static String DeterminarSigno(int dia, int mes) {
           
       
            
        
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                return "Acuario";

            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                return "Piscis";

            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                return "Aries";

            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                return "Tauro";

            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                return "Géminis";

            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                return "Cáncer";

            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                return "Leo";

            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                return "Virgo";

            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                return "Libra";

            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                return "Escorpio";

            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                return "Sagitario";

            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                return "Capricornio";

            } else {
                return "Signo no determinado";
            }

        
        }

        private static String MensajeHoroscopo(String signo){
            switch (signo) {
                case "Capricornio":
                    return "Analiza profundamente cómo y qué vas a cambiar, este será un momento de avance para tu creatividad. Echa un vistazo a tus asociaciones, probablemente tendrás que hacer cambios, y si los haces, utiliza tu intuición. Por último, si vas a cerrar algún proyecto hoy, revísalo muy bien, podría tener errores.";


                    
                    

                case "Acuario":
                    return "Será el momento para que elija a la persona que realmente lo haga feliz en el amor y no la persona que lo sustente monetariamente. Riqueza: Prepárese, ya que aparecerán cambio en el status social y laboral. Aproveche la ocasión para avanzar con decisión y precisión en sus negocios.";
                
                case "Piscis":
                    return "Aprovecha tus magníficas relaciones actuales para cambiar de actividad o para dar a tu actividad un nuevo aire, y si quieres, para ampliar horizontes; tendrás que esforzarte pero los resultados merecerán la pena. Piscis, en el terreno familiar, las relaciones con tus parientes marcharán viento en popa.";

                case "Aries":
                    return "No te desmoralices, Aries, si hoy surgen pequeños contratiempos. La vida es así, casi nunca es plana, siempre tiene altibajos que tenemos que superar. Además tú ya te has enfrentado a diario a dificultades serias que has sabido superar gracias a tu gran fuerza interior.";

                case "Tauro":
                    return "Lo más recomendable para cuando intente comunicarse con alguien durante esta jornada será que busque un diálogo conciliador, sin confrontar a la gente que lo rodea. Amor: Lo mejor será que hoy tome distancia si surjen problemas con su pareja.";

                case "Géminis":
                    return "Relájese, ya que será una jornada en la que su espontaneidad será bien recibida. No deje pasar el tiempo y exprese sus emociones en el momento oportuno. Amor: Transitará un ciclo de maduración en sus vínculos.";

                case "Cancer":
                    return "Entienda que debe mantenerse precavido, ya que podrían aparecer personas envidiosas que intenten retardar su éxito. Procure alejarse de las mismas. Amor: No tema en aprender a expresar lo que siente realmente.";

                case "Leo":
                    return "Aprenda a como mantener siempre la serenidad y la confianza en su espíritu. Sepa que debe comprender que ambas, son la llave de la sabiduría en la vida. Amor: Durante este día, no permita que la intensidad afectiva dañe los vínculos y que la pasión lo desborde.";

                case "Virgo":
                    return "Empieza a hacer hoy pequeños cambios en tu forma de hacer las cosas, busca una manera más lúdica para todo. Te hará estar de mejor humor. Tómate la vida como un juego y diviértete siempre que puedas. Esto sirve para todos los ámbitos, incluso el laboral.";

                case "Libra":
                    return "Vivirás momentos de tensión a nivel laboral, concentración. Salud: Los malos hábitos son muy fáciles de aprender y muy difíciles de olvidar. Deberás poner la fuerza de cada fibra de tu ser para hacerlo. Amor: Lo especial de cada momento no lo pone el destino, sino tú.";

                case "Escorpio":
                    return "Será un día complicado hoy, así que espera lo inesperado, todo puede suceder, tanto situaciones gratas como de cambios de planes. Es posible que una de tus amistades con la que tenías planeado hacer algo, cambie de opinión a última hora: no discutas y acéptalo. Sal a hacer un poco de ejercicio si puedes.";

                case "Sagitario":
                    return "En vez de preocuparte tanto por esos problemas de trabajo que te agobian a diario, Sagitario, intenta hacer hoy algunos cambios en tu forma de enfocar las cosas. Te irá bien ordenar tu espacio. El orden siempre trae consigo relajación y perspectivas positivas.";
                default:
                    return "no se pude determinar ningun mensaje para este signo.";
                    
            }
        }
        
}
