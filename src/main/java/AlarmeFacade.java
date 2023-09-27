import java.util.ArrayList;
import java.util.List;

public class AlarmeFacade {

    private List<Alarme> alarmesAtivos;
    private List<Alarme> alarmesResolvidos;

    public AlarmeFacade() {
        alarmesAtivos = new ArrayList<>();
        alarmesResolvidos = new ArrayList<>();
    }

    public void addAlarme(Alarme alarme){
        alarmesAtivos.add(alarme);
    }

    public List<String> dispararAlarmesAtivos(){
        List<String> alarmesDisparados = new ArrayList<>();
        for (Alarme alarme : alarmesAtivos) {
            alarmesDisparados.add(alarme.dispararAlarme());
        }
        return alarmesDisparados;
    }

    public List<String> resolverAlarme(int alarme){
        //naão vem errado, tem uma interface, nela o usuario clica no alarme e o numero vem certo
        List<String> alarmesResolvidos = new ArrayList<>();
        alarmesResolvidos.add(alarmesAtivos.get(alarme).resolverAlarme());
        this.alarmesResolvidos.add(alarmesAtivos.get(alarme));
        alarmesAtivos.remove(alarme);
        return alarmesResolvidos;
    }

    public boolean existemAlarmesAtivos(){
        boolean temAtivos = false;
        if (alarmesAtivos.isEmpty()){
            temAtivos = true;
        }
        return temAtivos;
    }

    public List<Alarme> getAlarmesAtivos() {
        return alarmesAtivos;
    }

    public List<Alarme> getAlarmesResolvidos() {
        return alarmesResolvidos;
    }
}
