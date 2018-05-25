/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.SessionBeans.Stateless;

import javax.ejb.Stateless;

/**
 *
 * @author crist
 */
@Stateless
public class Calculos implements CalculosLocal {

    /**
     *
     * @param numero_uno
     * @param numero_dos
     * @return
     */
    @Override
    public int suma(int numero_uno, int numero_dos){
        return numero_uno + numero_dos;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
