package ch.bbbaden.wandtafel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Joel Meier
 */
public class Schueler implements SchuelerIterator{
    private List <String> schueler=new ArrayList<>();
    private Random random = new Random();
    private int currentPos = random.nextInt(16)+1;
    
    public void fillList(){
        schueler.add("Elena Algaria");
        schueler.add("Sharushan Atputharasa");
        schueler.add("Nico Auchli");
        schueler.add("Laouand Baro");
        schueler.add("Luca Baumgartner");
        schueler.add("Luca Eggenberg(er)");
        schueler.add("Jasmine Herklotz");
        schueler.add("Yannick Huggler");
        schueler.add("Athiban Jegatheeswaran");
        schueler.add("Andrea Mangione");
        schueler.add("Joel Meier");
        schueler.add("Iuri Menia");
        schueler.add("Florian Schäfer");
        schueler.add("Jelle Schutter");
        schueler.add("Bence Urszin");
        schueler.add("Marvin von Rappard");

    }
    @Override
    public boolean hasNext() {
    if(currentPos + 1 < schueler.size()){
        return true;
    }    
    return false;
    }
    
    @Override
    public String currentItems() {
    return schueler.get(currentPos);
    }

    @Override
    public void next() {
    currentPos++;    
    }
      
    
}
