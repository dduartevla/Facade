public class FalhasDispositivos implements Condicao {
    @Override
    public String getResolucao() {
        return "Falha de Dispositivo Resolvida";
    }

    @Override
    public String getMensagem() {
        return "Falha de Dispositivo. >>ALTO<<";
    }
}
