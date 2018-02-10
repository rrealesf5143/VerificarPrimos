import java.util.Scanner;
//Libreria Java para leer los datos
/**
 * Escriba una descripcios de la clase VerificarNumerosPrimos.
 *
 * @autor Ronald Reales rrealesf5143@universidadean.edu.co
 * @version Version 2
 */
public class ChecarNumerosPrimos
{
    // el método main empieza la ejecución de la aplicación en Java
    public static void main(String args[])
    {
        //  creamos un objeto de tipo //scanner para lectura de datos por teclado
        Scanner scan = new Scanner(System.in);
        
        //declaramos 3 variables enteras de alto rango
        //a para el resultado,
        //i que sera el contador del ciclo for
        // y num que es numero a verificar por el usuario
        //desde cero
        int a= 0, num, i, count=0;
        
        //Nuestro programa arranca con este mensaje
        System.out.println ("Bienvenido a ¿Numero, Tu eres Primo o no?" );
        System.out.println("Ingrese cualquier numero Mayor que CERO para verificar si es primo : ");
        // almacenamos el numero introducido en num
        num = scan.nextInt(); 
        
        //Como el numero1 no es primo debemos hacer una excepcion
        if(num == 1)
        
        {
            System.out.println("NUMERO NO ES PRIMO");
            System.out.println(" ************************");
            System.out.println("Gracias por usar este Programa en Java!  Reiniciando 99%..100%: ");
            System.out.println("");
            //Reiniciamos el main, para reiniciar el programa
    ChecarNumerosPrimos.main (args);
        }
       
        // creamos un ciclo con for para una iteracion de 1 hasta n 
        for(i=2; i<num; i++)
        {
            //// entramos al for y si el remanente de numm entre i (posicion) es menor a n+1 
            // coun++; a incrementa 1
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        // MENSAJES INDICANDO SI ES PRIMO O NO
        if(count == 0)
        {
            System.out.print("NUMERO SI ES PRIMO");
            System.out.println(" ************************");
            System.out.println("Gracias por usarme...Reiniciando 99%..100%: ");
            System.out.println("");
        }
        else
        {
            System.out.println("NUMERO NO ES PRIMO");
            System.out.println(" ************************");
            System.out.println("Gracias por usarme...Reiniciando 99%..100%: ");
            System.out.println("");
        }
        
        //fin del método main�
        
    //Reiniciamos el main, para reiniciar el programa y poder volver a usarlo
    ChecarNumerosPrimos.main (args);
   
}
    
}