import application.*;

public class Main {
    public static void main(String[] args) {
        Assurance assurance = new RespCivil();
        System.out.println("Count RespCivil : " + assurance.cout());
        assurance = new Vol(assurance);
        System.out.println("Count RespCivil + Vol : " + assurance.cout());
        assurance = new Incendie(assurance);
        System.out.println("Count RespCivil + Vol + Incendie : " + assurance.cout());
        assurance = new Inondation(assurance);
        System.out.println("Count RespCivil + Vol + Incendie + Inondation : " + assurance.cout());
        assurance = new BrisGlace(assurance);
        System.out.println("Count RespCivil + Vol + Incendie + Inondation + Bris de Glace : " + assurance.cout());
    }
}
