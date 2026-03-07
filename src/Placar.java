public class Placar {
    public String TimeCasa, TimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar(String TimeCasa, String TimeVisitante){
        this.TimeCasa = TimeCasa;
        this.TimeVisitante = TimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }
    public void registrarPonto(String time, int tipo) {

        int pontos = 0;

        switch (tipo) {
            case 1:
                pontos = 1;
                break;
            case 2:
                pontos = 2;
                break;
            case 3:
                pontos = 3;
                break;
            default:
                System.out.println("Tipo de ponto inválido.");
                return;
        }

        if ("casa".equalsIgnoreCase(time)) {
            pontosCasa += pontos;
        } else if ("visitante".equalsIgnoreCase(time)) {
            pontosVisitante += pontos;
        } else {
            System.out.println("Time inválido.");
        }
    }

    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
        } else {
            System.out.println("O jogo terminou");
        }
    }
    public String toString(){
        return TimeCasa + " [" + pontosCasa + "] " + TimeVisitante + " [" + pontosVisitante + "] " + " [" + periodoQuarto + "] ";
    }

}
