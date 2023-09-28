public class Umidade implements Condicao{


    @Override
    public String getResolucao() {
        return "Irrigação Acionada.";
    }

    @Override
    public String getMensagem() {
        return "Umidade abaixo do mínimo perimitido. >>URGENTE<<";
    }
}
