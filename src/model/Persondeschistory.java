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
public class Persondeschistory {
    private ArrayList<Persondesc> history;
   /**
     *
     */
    public Persondeschistory()
    {
        this.history = new ArrayList<Persondesc>();
        
    }

    
    public ArrayList<Persondesc> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Persondesc> history) {
        this.history = history;
    }

   
    public Persondesc addnewdesc()
    {
        Persondesc newdesc=new Persondesc();
        history.add(newdesc) ;
        return newdesc;
    }
    
    public void deletevitals(Persondesc vs)
    {history.remove(vs);
    }
    
}
