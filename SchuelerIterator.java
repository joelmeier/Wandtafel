/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.wandtafel;

/**
 *
 * @author Joel Meier
 */
public interface SchuelerIterator {
    public boolean hasNext();
    public void next();
    public String currentItems();
}
