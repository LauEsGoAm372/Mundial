/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author Miguel Barón
 */
public class Unit {
        public ArrayList definirGrupos(ArrayList equipos){
        equipos.add(new Component("A", "Qatar") {});
        equipos.add(new Component("A", "Ecuador") {});
        equipos.add(new Component("A", "Senegal") {});
        equipos.add(new Component("A", "Paises Bajos") {});
        equipos.add(new Component("B", "Inglaterra") {});
        equipos.add(new Component("B", "Iran") {});
        equipos.add(new Component("B", "EEUU") {});
        equipos.add(new Component("B", "Gales") {});
        equipos.add(new Component("C", "Argentina") {});
        equipos.add(new Component("C", "Arabia Saudi") {});
        equipos.add(new Component("C", "Mexico") {});
        equipos.add(new Component("C", "Polonia") {});
        equipos.add(new Component("D", "Francia") {});
        equipos.add(new Component("D", "Australia") {});
        equipos.add(new Component("D", "Dinamarca") {});
        equipos.add(new Component("D", "Tunez") {});
        equipos.add(new Component("E", "España") {});
        equipos.add(new Component("E", "Costa Rica") {});
        equipos.add(new Component("E", "Alemania") {});
        equipos.add(new Component("E", "Japon") {});
        equipos.add(new Component("F", "Belgica") {});
        equipos.add(new Component("F", "Canada") {});
        equipos.add(new Component("F", "Marruecos") {});
        equipos.add(new Component("F", "Croacia") {});
        equipos.add(new Component("G", "Brazil") {});
        equipos.add(new Component("G", "Serbia") {});
        equipos.add(new Component("G", "Suiza") {});
        equipos.add(new Component("G", "Camerun") {});
        equipos.add(new Component("H", "Portugal") {});
        equipos.add(new Component("H", "Ghana") {});
        equipos.add(new Component("H", "Uruguay") {});
        equipos.add(new Component("H", "Corea del Sur") {}); 
        
        return equipos;
    }
}
