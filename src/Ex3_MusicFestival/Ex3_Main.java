package Ex3_MusicFestival;

import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex3_Main {
    public static void run(){

        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("walk off the Earth", "music") );
        allEvents.add( new MainStageEvent("Hemple Temple", "music"));
        allEvents.add( new NonMusicEvent("Face Painting Booth", "kids activity",  "Tent 4"));


        ((MainStageEvent)allEvents.get(1)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(1)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size() ; i++) {
            System.out.println(allEvents.get(i).getEventName());

            if( allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }



        }
    }

