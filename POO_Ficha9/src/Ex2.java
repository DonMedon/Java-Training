public class Ex2 {

    public static void main(String[] args) {
        Cao bobby = new Cao("Bobby", "Beagle");
        Cao bolinhas = new Cao("Bolinhas", "Caniche");
        Cao max = new Cao("Max", "Pastor Alemão");

        System.out.println("Nome do primeiro cão: "+bobby.getNome());
        System.out.println("Raça do primeiro cão: "+bobby.getRaca());

        System.out.println();

        System.out.println("Nome do segunudo cão: "+bolinhas.getNome());
        System.out.println("Raça do segunudo cão: "+bolinhas.getRaca());

        System.out.println();

        System.out.println("Nome do terceiro cão: "+max.getNome());
        System.out.println("Raça do terceiro cão: "+max.getRaca());

        System.out.println();

        bobby.setRaca("Labrador");

        System.out.println("Raça do bobby atualizada: "+bobby.getRaca());

        max.ladrar();
    }
}
