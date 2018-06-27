package edu.facundo.paquete.metodosAbstractos;

public class ClaseX {

    public static void main (String ars[]){

        ClaseA  claseA = new ClaseA();

        claseA.metodo1(new ClaseB() {
            @Override
            void metodoAbstracto1() {

                System.out.println("abstracto 1");
            }

            @Override
            void metodoAbstracto2() {
                System.out.println("abstracto 2");

            }
        });






    }
}
