
public class Main {
    public static void main(String[] args) {

        //Criamos um objeto cafe do tipo CafeSimples, que é o café base
        Cafe cafe = new CafeSimples();
        System.out.println("Custo do café simples: " + cafe.custo());

        //envolvemos esse objeto em decoradores como açucar e leite
        //chamando seus construtores atualizando a referencia cafe

        cafe = new Acucar(new CafeSimples());
        System.out.println("Custo do café com açúcar: " + cafe.custo());

        cafe = new Leite(new CafeSimples());
        System.out.println("Custo do café com leite: " + cafe.custo());


        //cafe acaba sendo uma instância do Leite, que envolve um Acucar,
        // que, por sua vez, envolve um CafeSimples. Quando você chama cafe.custo(),
        // ele percorre a cadeia de decoradores na ordem correta, primeiro calculando
        // o custo do açúcar, depois o custo do leite e, finalmente,
        // o custo do café base, retornando assim o custo total do café com açúcar e leite.

        cafe = new Leite(new Acucar(new CafeSimples()));
        System.out.println("Custo do café com açúcar e leite: " + cafe.custo());



    }
}
