package application;

public abstract class Option extends Assurance{

    protected Assurance assurance;

    public Option(Assurance assurance) {
        this.assurance = assurance;
    }
}
