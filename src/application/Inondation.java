package application;

public class Inondation extends Option{
    public Inondation(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return super.assurance.cout() + 700;
    }
}
