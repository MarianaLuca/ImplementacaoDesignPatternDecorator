//outro decorador concreto chamado Leite, que segue a mesma estrutura do decorador Acucar.
// Ele estende a classe abstrata DecoradorCafe, recebe uma referência ao objeto Cafe no construtor
// e implementa o método custo() para adicionar o custo do leite (2) ao custo do café base.

public class Leite extends DecoradorCafe{
    public Leite(Cafe cafe) {

        super(cafe);
    }

    @Override
    public int custo() {

        return cafe.custo() + 2;
    }
}
