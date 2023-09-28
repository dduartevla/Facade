public class Nutrientes implements Condicao{

    @Override
    public String getResolucao() {
        return "Nutrientes Adicionados";
    }

    @Override
    public String getMensagem() {
        return "Níveis de nutrientes abaixo do mínimo permitido. >>URGENTE<<";
    }
}
