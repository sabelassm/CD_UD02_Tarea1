
# Markdown

Ejercicio 1: mostrar al usuario su horoscopo chino segun su anho de nacimiento.
Ejercicio 2: mostrar un saludo a 4 personas una vez introducidos sus nombres.

## Tabla de contenido
1. Ejercicio 1
2. Ejercicio 2
 

### Titulos 

Ejercicio 1: Horoscopo chino
Ejercicio 2: Saludo a 4 personas 
Posible ejercicio 3: python
Posible ejercicio 4: php
Posible ejercicio 5: .NET
### Cursivas

*Java mola!* 

### Negrilla

**Java mola!**

### Vinetas

1.Ejercicio 1
2.Ejercicio 2

- Ejercicio 1
- Ejercicio 2


## Párrafos y saltos de línea

Ejercicio 1

Ejercicio 2
Probando hacer un  
salto de linea 

### Insertar imagenes

![Pajarito](/home/sanclemente.local/a23vanessabg/Escritorio/loro.jpeg "Lorito bonito") 

### Insertar enlaces

[navegador](https:/google.es/)

### Hacer anclaje

[quiero anclar a la tabla de contenido](#Tabla de contenido)

### Insertar una linea de codigo
Ejercicio 1:
`import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anhoUsuario;
        
        System.out.println("Voy a decirte tu signo en el horóscopo chino");
        System.out.println("¿En qué año naciste? ");
        anhoUsuario = teclado.nextInt();
        int resto = anhoUsuario%12;

        switch (resto) {
            case 0:
                System.out.println("Tu signo es Mono");
                break;
            case 1:
                System.out.println("Tu signo es Gallo");
                break;
            case 2:
                System.out.println("Tu signo es Perro");
                break;
            case 3:
                System.out.println("Tu signo es Cerdo");
                break;
            case 4:
                System.out.println("Tu signo es Rata");
                break;
            case 5:
                System.out.println("Tu signo es Buey");
                break;
            case 6:
                System.out.println("Tu signo es Tigre");
                break;
            case 7:
                System.out.println("Tu signo es Conejo");
                break;
            case 8:
                System.out.println("Tu signo es Dragón");
                break;
            case 9:
                System.out.println("Tu signo es Serpiente");
                break;
            case 10:
                System.out.println("Tu signo es Caballo");
                break;
            case 11:
                System.out.println("Tu signo es Cabra");
                break;
            default:
            System.out.println("No has introducido un número correcto");
                break;
        }

    teclado.close();
    }
}`

### Insertar tablas

|Dia|Mes|
|---|--------|
|13|Noviembre|
|14|Diciembre|

### Editores en Markdown 

[editor markdown](http://writemonkey.com/download.php) 

### Otras referencias sobre Markdown

<http://writemonkey.com/download.php> 

