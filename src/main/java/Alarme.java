public class Alarme {

    private Condicao condicao;

    public Alarme (){
    }

    public void setCondicao(Condicao condicao){
        if (condicao == null){
            throw new IllegalArgumentException("CONDIÇÃO INVALIDA");
        }
        this.condicao = condicao;
    }

    public String dispararAlarme(){
        return "Alarme disparado: " + condicao.getMensagem();
    }

    public String resolverAlarme(){
        return "Alarme resolvido: " + condicao.getResolucao();
    }

}
