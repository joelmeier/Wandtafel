package ch.bbbaden.wandtafel;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel Meier
 */
public class GUI {
    Putzer putzer = new Putzer();
    public void erstellen(){
        Object[] option = {"Wer putzt heute?", "Abbrechen"};
        int selected = JOptionPane.showOptionDialog(null, "Erstellen","Erstellen", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, option, option[0]); 
        if(selected==0){
            System.out.println(putzer.getIterator());
        }else 
            System.exit(0);
    }
}
