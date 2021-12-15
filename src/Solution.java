



import java.util.Arrays;
import java.util.Scanner;


public class Solution
{

    public static void main(String[] args)
    {



        // 8. Escriu un programa que donat un vector que guarda els pesos de 20 persones (valors enters positius entre 50 i 100), escrigui per pantalla un histograma que representi el nombre de persones per cada pes especificat.
        //    Consideracions:
        //
        //        - A l'histograma només apareixeran els pesos amb una o més persones.
        //
        //                - El vector de pesos s'ha de definir en el codi, NO cal preguntar-los a l'usuari.
        //
        //                - Els vector de pesos no està ordenat. PISTA: usar el mètode Arrays.sort(...) per ordenar-lo.
        //
        //                Exemple:
        //
        //        pesos[20]={55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65}
        //
        //        Histograma
        //
        //                --------------------------------------
        //
        //        55 **
        //
        //        61 ****
        //
        //        65 *********
        //
        //        70 *****

        Scanner sc = new Scanner(System.in);
        int[] ar1 = new int[20];
        int i;

        for (i = 0; i < ar1.length; i++){/*introduccio dels 20 valors de l'array*/
            while ( ar1[i] < 50 || ar1[i] > 100){
                System.out.println("introdueis el valor "+ (i+1)+ " de l'array(valor entre 50 i 100)");
                ar1[i] = sc.nextInt();
            }
        }

        Arrays.sort(ar1);

        System.out.println("");
        System.out.print(ar1[0] + " *");

        for (i = 1; i < ar1.length;i++) {
            if (ar1[i] != ar1[i-1]) {				/*posicio 0 de l'arrai s'imprimeix directament*/
                System.out.println("");				/*si la posicio i de l'array no es igual a l'anterior...*/
                System.out.print(ar1[i] + " *");
            }
            else {	/*si la posicio i es igual a la anterior afegeix * */
                System.out.print("*");
            }
        }
        sc.close();

        //Una altra solucio
        int[] cantPesos = new int[100];
        int[] pesos = {55,61,65,70,55,61,65,70,61,70,61,70,70,65,65,65,65,65,65,65};

        //ordenarlo
        Arrays.sort(pesos);

        System.out.print("Los pesos ordenados: ");
        for( i=0; i < pesos.length; i++){
            System.out.print(pesos[i] + " ");
        }

        for( i=0; i < pesos.length; i++){
            cantPesos[pesos[i]] = cantPesos[pesos[i]] + 1;
        }

        System.out.println();

        for( i=0; i < cantPesos.length; i++){
            if(cantPesos[i] > 0){
                System.out.print(i + " ");
                for(int j=0; j < cantPesos[i];j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
