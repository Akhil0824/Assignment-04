/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//public arrayList<modeldesc> history;
package model;

import java.util.ArrayList;

/**
 *
 * @author Akhil
 */
//arrayList<modeldesc> history;
public class Vitaldeschistory {
    private ArrayList<Vitaldesc> vitalhistory;
   /**
     *
     */
    public Vitaldeschistory()
    {
        this.vitalhistory = new ArrayList<Vitaldesc>();
        
    }

    
    public ArrayList<Vitaldesc> getvitalHistory() {
        return vitalhistory;
    }

    public void setvitalHistory(ArrayList<Vitaldesc> vitalhistory) {
        this.vitalhistory = vitalhistory;
    }

   
    public Vitaldesc addnewdesc()
    {
        Vitaldesc newdesc=new Vitaldesc();
        vitalhistory.add(newdesc) ;
        return newdesc;
    }
    
    public void deletevitals(Vitaldesc vs)
    {vitalhistory.remove(vs);
    }
    
}
