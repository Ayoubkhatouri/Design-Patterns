import composants.Boisson;
import composants.Sumatra;
import decoretors.Caramel;
import decoretors.Chocolat;

public class Main {
    public static void main(String[] args) {
        Boisson boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("After adding dynamically Chocolat to  the object something in the runtime");

        boisson=new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("After adding Caramel");

        boisson=new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}