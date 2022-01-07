package application;

public class BrisGlace extends Option{
    public BrisGlace(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return super.assurance.cout() + 200;
    }
}
