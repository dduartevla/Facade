public class Temperatura implements Condicao{

    @Override
    public String getResolucao() {
        return "Controladores de Temperatura Acionados";
    }

    @Override
    public String getMensagem() {
        return "Temperatura acima dos níveis definidos. >>MEDIO<<";
    }
}
