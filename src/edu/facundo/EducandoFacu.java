package edu.facundo;

public class EducandoFacu {
    public static void main(String args[]){
        Educando educando = new Educando();

        educando.procesar();
    }
}

class Educando{

    String nombreCompleto;

    void procesar(){
        imprimirNombre();

        imprimirNombre2("Rolando");

        compararNumeros(10);

        buclesNum(6,12);

        funcion();

        datosPersonales();

        jamaica();

        completandoMiNombre();
    }


    void imprimirNombre(){

        System.out.println("Facundo");
    }

    void imprimirNombre2(String nombre){

        System.out.println(nombre);
    }

    void compararNumeros(int num1){

    }

    void compararNumeros (int num1, int num2){

        if (num1 > num2){
            System.out.println("El primer valor es mayor");
        } else if (num1 == num2){
            System.out.println("Son iguales");

        } else {
            System.out.println("El primer valor no es mayor");
        }


    }

    void buclesNum (int x1, int x2){
        x1++;

        for (; x1<=x2; x1++){
            System.out.println(x1);
        }


    }

    void funcion (){

        int x= func1();
        int y= func2 ();

        System.out.println(x+y);

    }

    int func1(){

        return 5;
    }

    int func2 (){

        return 7;
    }

    void datosPersonales (){

        String Nombre=nomb();

        String Apellido=apel();

        int Edad=eda();

        System.out.println(Nombre + " " + Apellido + " " + Edad);
    }

    String nomb(){

        return "Nicolas";
    }

    String apel (){

        return "Morales";
    }

    int eda (){

        return 38;
    }

    void jamaica(){

        int j=j0();{

            switch (j){
                case 2:
                    System.out.println(j);
                            break;

                case 3:
                    System.out.println(j);
                            break;
                case 7:
                    System.out.println(j);
                            break;
                default:
                    System.out.println("No es ninguno");


            }

        }

    }

    int j0 (){

        return 7;

    }

    void probadoFuncionDentroDeFuncion(){

    }

    int funcion3(){
        return 4;
    }

    void completandoMiNombre(){

        agregarNombre();

        agregarApellido();

        imprimirNombreCompleto();






    }

    void agregarNombre(){

        nombreCompleto= "Facundo";


    }
    void agregarApellido(){

        nombreCompleto= nombreCompleto+" Di Paolo";

    }

    void imprimirNombreCompleto(){

        System.out.println(nombreCompleto);


    }



}

