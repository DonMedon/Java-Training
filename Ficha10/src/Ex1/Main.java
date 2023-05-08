package Ex1;

public class Main {
    public static void main(String[] args) {

        Carro carroDoBernardo = new Carro("Audi", "A1", 2017, 80, 1500, 4.5, Combustivel.GASOLEO);

        Carro carroDoAngelo = new Carro("Opel", "Corsa", 2018, 80, 1500, 6.2, Combustivel.GASOLINA);


        Carro vencedor=carroDoBernardo.corrida(carroDoAngelo);
        if (vencedor == null) {
            System.out.println("Deu empate");
        }else{
            System.out.println("Vencedor: ");
            vencedor.exibirDetalhes();
        }

        if (vencedor == null) {
            System.out.println("Não consigo calcular o consumo vencedor, pois não houve vencerdor! Deu empate!!!");
        }else{
            System.out.println("Consome:"+ vencedor.calcularConsumo(97));
        }


    }
}