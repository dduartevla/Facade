import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class AlarmeFacadeTest {

    AlarmeFacade alarmeFacade;
    @BeforeEach
    void setUp(){
        alarmeFacade = new AlarmeFacade();

        Condicao condicaoNutrientes = new Nutrientes();
        Condicao condicaoTemperatura = new Temperatura();

        Alarme alarmeNutrientes = new Alarme(); alarmeNutrientes.setCondicao(condicaoNutrientes);
        Alarme alarmeTemperatura = new Alarme(); alarmeTemperatura.setCondicao(condicaoTemperatura);

        alarmeFacade.addAlarme(alarmeNutrientes);
        alarmeFacade.addAlarme(alarmeTemperatura);

    }

    @Test
    void deveAdicionarUmAlarme(){
        Condicao condicao = new Humidade();
        Alarme novoAlarme = new Alarme();
        novoAlarme.setCondicao(condicao);
        alarmeFacade.addAlarme(novoAlarme);
        assertEquals(3,alarmeFacade.getAlarmesAtivos().size());
    }

    @Test
    void deveDispararAlarmesAtivos(){
        List<String> alarmesDisparados = new ArrayList<>();
        alarmesDisparados.add("Alarme disparado: Níveis de nutrientes abaixo do mínimo permitido. >>URGENTE<<");
        alarmesDisparados.add("Alarme disparado: Temperatura acima dos níveis definidos. >>MEDIO<<");
        assertEquals(alarmesDisparados,alarmeFacade.dispararAlarmesAtivos());
    }

    @Test
    void deveResolverAlarme(){
       assertEquals("Alarme resolvido: Controladores de Temperatura Acionados", alarmeFacade.resolverAlarme(1));
       assertEquals(1,alarmeFacade.getAlarmesAtivos().size());
       assertEquals(1,alarmeFacade.getAlarmesResolvidos().size());
    }

    @Test
    void retornarTemAlarmesAtivosFalso(){
        alarmeFacade.resolverAlarme(0);
        alarmeFacade.resolverAlarme(0);
        assertEquals(false, alarmeFacade.existemAlarmesAtivos());
    }

}