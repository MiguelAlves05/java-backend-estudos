public class TestaCarro {
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Palio";
        obj1.placa = "E2D31F0";

        System.out.println(obj1.toString());
        obj1.ligar();
        System.out.println(obj1.toString());

        Carro obj2 = new Carro("Vowlks", "Gol", "E2D31F0");
        System.out.println(obj2.toString());
        obj2.frear(20);
        System.out.println(obj2.toString());
    }
}
