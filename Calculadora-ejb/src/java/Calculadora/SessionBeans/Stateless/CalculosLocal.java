/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora.SessionBeans.Stateless;

import javax.ejb.Local;

/**
 *
 * @author crist
 */
@Local
public interface CalculosLocal {
    public int suma(int numero_uno, int numero_dos);
}
