package poo_fp11.stand;

public class Main {
    public static void main(String[] args) {

        Veiculo carroDoBernardo = new Veiculo("Audi", "A1", 2017, 80, 1500, 4.5);
        Veiculo carroDoAngelo = new Veiculo("Opel", "Corsa", 2018, 80, 1500, 6.2);


        Veiculo vencedor=carroDoBernardo.corrida(carroDoAngelo);
        if (vencedor == null) {
            System.out.println("Deu empate");
        }else{
            System.out.println("Vencedor da corrida: ");
            vencedor.exibirDetalhes();
        }

        if (vencedor == null) {
            System.out.println("Não consigo calcular o consumo vencedor, pois não houve vencerdor! Deu empate!!!");
        }else{
            System.out.println("Consome:"+ vencedor.calcularConsumo(97));
        }
        System.out.println("---------------------------------------------------------------------------------------------");

        Carro viagem1 = new Carro("Audi", "A1", 2017, 80, 1500, 4.5, Combustivel.DIESEL);
        Carro viagem2 = new Carro("Opel", "Corsa", 2018, 80, 1500, 6.2, Combustivel.GASOLINA);
        viagem1.exibirDetalhes();
        viagem1.calcularCusto(150);

        System.out.println("----------------------------------------------------------------------------------------------");

        Mota mota1 = new Mota("Honda", "CBR", 2015, 75, 500, 5.0);

        mota1.printFile("src/poo_fp11/stand/Mota.txt");
    }
}
