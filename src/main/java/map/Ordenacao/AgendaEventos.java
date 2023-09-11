package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionaEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//       Set<LocalDate> dataSet = eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
        //eventosMap.get();


        LocalDate dataAtual = (LocalDate.now());
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); //organiza por ordem crescente
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
            break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionaEvento(LocalDate.of(2023, Month.SEPTEMBER, 15),"Evento 1", "Atração 1");
        agendaEventos.adicionaEvento(LocalDate.of(2024, Month.OCTOBER, 9),"Evento 2", "Atração 2");
        agendaEventos.adicionaEvento(LocalDate.of(2023, Month.JANUARY, 10),"Evento 3", "Atração 3");
        agendaEventos.adicionaEvento(LocalDate.of(2023, Month.SEPTEMBER, 12),"Evento 4", "Atração 4");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
