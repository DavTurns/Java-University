package Aufgabe2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    List<Stadt> stadtList;

    private final int NR_THREADS = 4;
    TemperatureStrategy strategy;

    public Controller(TemperatureStrategy strategy) {
        this.strategy = strategy;
        this.stadtList = new ArrayList<>();
    }

    public void calculateTotalCitizens(){

        List<Thread> threads = new LinkedList<>();

        int chunksize = stadtList.size() / NR_THREADS;
        int start, end;
        for(int i = 0; i< NR_THREADS; i++){
            start = i * chunksize;
            end = (i + 1) * chunksize;
            if(i == NR_THREADS - 1){
                end = stadtList.size();
            }
            threads.add(new CitizenCountThread(start,end,stadtList));
        }

        for(int i = 0; i< NR_THREADS; i++){
            threads.get(i).start();
        }

        for(int i = 0; i< NR_THREADS; i++){
            try {
                threads.get(i).wait();
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println( threads.stream().mapToDouble(t -> ((CitizenCountThread) t).getSum()).sum());



    }

    public void setStrategy(TemperatureStrategy strategy) {
        this.strategy = strategy;
    }

    public void addTemperatures(Stadt stadt, List<Temperatur> temperaturList) {


        List<Stadt> stadtOptional = stadtList.stream().filter(stadt1 -> stadt1.getName().equals(stadt.getName()) && stadt.getCountry().equals(stadt1.getCountry())).collect(Collectors.toList());

        if (stadtOptional.size() == 1) {
            stadtOptional.get(0).addTemperatures(temperaturList);
            return;
        }
        stadt.setTemperaturList(temperaturList);
        stadtList.add(stadt);
    }

    public List<Stadt> getTemps() {
        return stadtList
                .stream()
                .map(stadt -> {
                            List<Temperatur> temps = stadt.getTemperaturList()
                                    .stream()
                                    .map(temperatur -> strategy.convert(temperatur))
                                    .collect(Collectors.toList());
                            stadt.setTemperaturList(temps);
                            return stadt;
                }
                )
                .collect(Collectors.toList());
    }


}
