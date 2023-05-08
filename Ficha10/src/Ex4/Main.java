package Ex4;

public class Main {
    public static void main(String[] args) {

    Imovel imovel1 = new Imovel("Rua 19", "Nº21", "Espinho", 450.0, 40.0, 5, 6, Tipo.CASA, Acabamento.USADA);
    Imovel imovel2 = new Imovel("Rua da Leira", "Nº6", "Miramar", 355.0, 38, 4, 4, Tipo.APARTAMENTO, Acabamento.NOVA);

    System.out.println();

    System.out.println("O imóvel 1 custa " + imovel1.calcularValor() + "€");

    System.out.println("-------------------------------------------------------------");

    System.out.println("Fiz obras no imóvel 1...");
    imovel1.setAcabamento(Acabamento.NOVA);
    System.out.println("O imóvel 1 tem agora o estado --> " + imovel1.getAcabamento());

    System.out.println();

    System.out.println("O imóvel custa agora " + imovel1.calcularValor() + "€");

    System.out.println("------------------------------------------------------------");

    Imovel maisCaro = imovel1.compararImoveis(imovel2);

    System.out.println("Estou a comparar o imóvel 1 e o imóvel 2!");
    if(maisCaro == null) {
        System.out.println("Os imóveis têm o mesmo preço");
    } else {
        System.out.println("O imóvel mais caro fica em: ");
        maisCaro.detalhesImovel();
    }

    }
}
