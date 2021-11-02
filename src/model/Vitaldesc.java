/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Akhil
 * public List 
 */
//public arrayList<modeldesc> history;

public class Vitaldesc {
    private int id;
    private int sp;
    private int dp;
    private Date vitaldate;

    public Date getVitaldate() {
        return vitaldate;
    }

    public void setVitaldate(Date vitaldate) {
        this.vitaldate = vitaldate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }
    
}
   