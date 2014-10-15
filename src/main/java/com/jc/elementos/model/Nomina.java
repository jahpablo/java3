/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

/**
 *
 * @author campitos
 */
public class Nomina {
    Trabajador t;

    public Nomina() {
       
    }

    public Nomina(Trabajador t) {
        this.t = t;
    }
    public float pagarNomina(){
        
        float pago=t.getHorasLaboradas()*t.getSueldoBase();
        return pago;
    }
    
}
