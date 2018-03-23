/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.wandtafel;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Joel Meier
 */
public class Putzer implements Abteilung{
    
    private Set<String> putzer=new HashSet<>();
    @Override
    public Set<String> getIterator() {
        do{
            Schueler schueler = new Schueler();
            schueler.fillList();
            putzer.add(schueler.currentItems());
        }while(putzer.size() < 2);
        return putzer;
    }
}

   
