// decorador Acucar, que estende a classe abstrata DecoradorCafe.
// No construtor, ele chama o construtor da classe pai  para configurar a referência
// ao objeto Cafe que está sendo decorado. A implementação do método custo()
// adiciona o custo do açúcar (1) ao custo do café base.
public class Acucar extends DecoradorCafe{
    public Acucar(Cafe cafe) {

        super(cafe);
    }

    @Override
    public int custo() {

        return cafe.custo() + 1;
    }
}
