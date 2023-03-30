import java.util.Scanner;

public class testDiagnostico {

/*
funcionalidades a implementar:
1.- invertir el orden de una cadena de texto
2.- calcular la suma de todos los numeros pares de un arreglo de enteros
3.- el estudiante aprobó, reprobo o va a examen
4.- banco de Temuco
 */


    public static void main(String[] args) {

        menu();
    }

    public static void menu() {

        System.out.println("bienvenido, ingrese un numero"
                + "\n1) inverir texto"
                + "\n2) calcular suma de numeros pares de un arreglo de enteros"
                + "\n3) El estudiante aprobó, reprobó o va a examen?"
                + "\n4) Credito de consumo banco de Temuco");

        entrada();

    }

    public static void entrada() {

        boolean contener = false;
        Scanner sc = new Scanner(System.in);
        int entrada = 0;

        do {
            System.out.println("ingrese un numero");
            if (sc.hasNextInt()) {
                entrada = sc.nextInt();
                contener = true;

            } else {
                sc.nextLine();
                System.out.println("ingrese un valor entero valido");

            }

        } while (!contener);

        switch (entrada) {

            case 1:
                invertirTexto("voltear");
                break;

            case 2:

                int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
                sumatoria(numeros);
                break;

            case 3:

                double[] notas = {3.3, 4.6, 1.2, 6.7};
                calcular_promedio(notas);
                break;

            case 4:
                //prestamo //cuotas
                tazaInteres(1500000, 36);
                break;

            default:
                System.out.println("ingrese un numero entre 1 y 4!!!");
                entrada();

        }
    }

    public static void invertirTexto(String texto) {

        StringBuffer otxet = new StringBuffer(texto);
        otxet.reverse();
        System.out.println(otxet);

    }

    public static void sumatoria(int[] numeros) {

        int sumaPar = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {

                sumaPar = sumaPar + numeros[i];
            }
        }
        System.out.println(sumaPar);
    }

    public static void calcular_promedio(double[] notas) {

        int cantidad_notas = notas.length;
        double suma_notas = 0;
        double promedio = 0;
        System.out.println("cantidad de notas :" + cantidad_notas);

        for (int recorrido = 0; recorrido < notas.length; recorrido++) {

            suma_notas = suma_notas + notas[recorrido];

        }
        promedio = suma_notas / cantidad_notas;

        System.out.println("Promedio del estudiante :" + promedio);


        if (promedio > 1.0 && promedio < 3.55) {

            System.out.println("el estudiante REPROBÓ :C");
        } else if (promedio > 3.55 && promedio < 3.95) {

            System.out.println("el estudiante va a examen :/");
        } else if (promedio > 3.95 && promedio < 7.0) {

            System.out.println("el estudiante.... APROBÓ!!!  :D");
        } else {
            System.out.println("ingrese notas validas");
        }
    }

    public static void tazaInteres(int prestamo, int cuotas) {

        double credito = 0;

        if (prestamo > 0 && prestamo <= 1000000) {

            if (cuotas >= 1 && cuotas <= 12) {

                credito = (prestamo * 0.25) * 100;

            } else if (cuotas > 12 && cuotas <= 23) {

                credito = (prestamo * 0.3) * 100;

            } else if (cuotas > 23) {

                credito = (prestamo * 0.35) * 100;

            } else {

                System.out.println("ingrese cantidad de cuotas validas");
            }
        } else if (prestamo > 1000000) {

            if (cuotas >= 1 && cuotas <= 12) {

                credito = (prestamo * 0.15) * 100;

            } else if (cuotas > 12 && cuotas <= 23) {

                credito = (prestamo * 0.20) * 100;

            } else if (cuotas > 23) {

                credito = (prestamo * 0.25) * 100;

            }
        } else {
            System.out.println("ingrese cantidad de cuotas validas Y/O prestamo valido");
        }

        System.out.println("Credito a pagar :" + credito);

        System.out.println("listo!!!");
    }
}


