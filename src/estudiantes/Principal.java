package estudiantes;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.ExistingAnnotationsType;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);
        Estudiantes[] estudiantes= new Estudiantes[5];
        Materias[] materias=new Materias[2];


        for(int i=0; i<5; i++){
            System.out.println("Ingrese la informacion para el estudiante " + (i+1));
            System.out.println("Nombre: ");
            scan.nextLine();
            String nombreAl = scan.nextLine();
            System.out.println("Edad: ");
            int edadAl= scan.nextInt();

            for(int j=0; j<2; j++){
                System.out.println("Nombre de la materia " + (j+1));
                String nombreMat= scan.nextLine();
                scan.nextLine();
                System.out.println("Nivel de la materia " + (j+1));
                int nivelMat = scan.nextInt();
                materias[j]=new Materias(nombreMat,nivelMat);


            estudiantes[i]= new Estudiantes(nombreAl,materias[j],edadAl);}
           System.out.println("Se ha ingresado el estudiante: " + estudiantes[i]);
        }
        int aux=0;
        do{

            if(estudiantes[aux].equals(estudiantes[aux + 1])){
                System.out.println("Existe duplicados en la posicion" + (aux)+ "y" + (aux+1) );
                aux++;
            }
        }while(aux==5);

    }
}

