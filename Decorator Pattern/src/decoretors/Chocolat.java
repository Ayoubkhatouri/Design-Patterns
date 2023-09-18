package decoretors;

import composants.Boisson;

public class Chocolat extends Decorator{

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }

    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
