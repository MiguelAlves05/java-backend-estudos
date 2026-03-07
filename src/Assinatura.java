public class Assinatura {
    public String usuario;
    public String plano;
    public double mensalidade;
    public boolean ativo = true;
    public String ultimoFilmeAssistido;

    public Assinatura(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        if("Basico".equals(plano)){
             this.mensalidade = 25.90;
        }  else if("Premium".equals(plano)){
             this.mensalidade = 50.90;
        }  else if("Familia".equals(plano)){
             this.mensalidade = 60.90;
        } else {
            System.out.println("Mensalidade inválida");
        }
    }

    public void assistirFIlme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + ultimoFilmeAssistido);
        } else {
            System.out.println("Pague a fatura do seu plano para assistir");
        }
    }
    public void cancelarAssinatura(){
        this.ativo = false;
    }
    public String toString(){
        String status;

        if (ativo) {
            status = "Ativo";
        } else {
            status = "Suspenso";
        }

        return "Usuario: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: " + mensalidade +
                "\nStatus: " + status +
                "\nUltimo filme assistido: " + ultimoFilmeAssistido;
    }
}
