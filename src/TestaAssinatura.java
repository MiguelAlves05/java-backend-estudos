public class TestaAssinatura {
    public static void main(String[] args) {
        Assinatura a1 = new Assinatura("Miguel", "Basico");
        a1.assistirFIlme("Vingadores");
        System.out.println(a1.toString());


        Assinatura a2 = new Assinatura("Isabella", "Premium");
        a1.cancelarAssinatura();
        a1.assistirFIlme("The Vampire Diaries");
        System.out.println(a2.toString());

    }
}
