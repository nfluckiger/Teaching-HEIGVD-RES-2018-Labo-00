/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Nathan
 */
public class Flute implements IInstrument {
    public String play(){
        return "tralala";
    }
    
    public int getSoundVolume(){
        return 1;
    }

   public String getColor(){
       return "rose";
   }
}