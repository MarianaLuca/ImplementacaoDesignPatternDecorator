//Esta é a classe abstrata DecoradorCafe
// Ela contém um membro protegido cafe que é uma referência ao objeto Cafe
// que está sendo decorado. O construtor DecoradorCafe permite que os decoradores
// concretos sejam construídos com uma referência ao objeto Cafe que estão decorando.

abstract class DecoradorCafe implements Cafe {
    protected  Cafe cafe;

    public DecoradorCafe(Cafe cafe) {

        this.cafe = cafe;
    }
}
