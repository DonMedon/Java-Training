public class Ex1 {
    public static void main(String[] args) {

        Carro carroDoBernardo = new Carro ("Audi", "A1", 2017, 90, 1400, 4.5, Combustivel.GASOLEO);
        carroDoBernardo.ligar();
        Carro carroDoAngelo = new Carro ("Opel", "Corsa", 2018, 80, 1500, 6.2, Combustivel.GASOLINA);
        carroDoBernardo.corrida(carroDoAngelo);


    }


}