package edu.facundo;

public class MostrarAnimal {
    public static void main(String args[]){

        Animal caballo = new Animal();
        Animal pato = new Animal();
        Animal chancho = new Animal();

        caballo.setColor("negro");
        caballo.setPatas(4);
        caballo.setTipo("yegua");

        System.out.println(caballo.getColor());
        System.out.println(caballo.getPatas());
        System.out.println(caballo.getTipo());

        pato.setColor("blanco");
        pato.setPatas(2);
        pato.setTipo("macho");

        System.out.println(pato.getColor());
        System.out.println(pato.getPatas());
        System.out.println(pato.getTipo());


        chancho.setColor("rosa");
        chancho.setPatas(6);
        chancho.setTipo("hermafrodita");

        System.out.println(chancho.getColor());
        System.out.println(chancho.getPatas());
        System.out.println(chancho.getTipo());



    }
}
