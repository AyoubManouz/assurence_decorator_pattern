package application;

public class Vol extends Option{
    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    public double cout() {
        return super.assurance.cout() + 100;
    }
}
