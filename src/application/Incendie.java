package application;

public class Incendie extends Option{
    public Incendie(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return super.assurance.cout() + 600;
    }
}
