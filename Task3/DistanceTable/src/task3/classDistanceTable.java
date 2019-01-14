/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
/**
 *
 * @author HChittenden
 */
public class DistanceTable {
    
    enum CitiesEnum {AMSTERDAM, BERLIN, COPENHAGEN, LONDON, MOSCOW, ROME, WARSAW;}
    
    HashMap<CitiesEnum, HashMap<CitiesEnum, Integer>> DistanceTable = new HashMap<>();
    
    public Integer getDistance(CitiesEnum City1, CitiesEnum City2) {
        return DistanceTable.get(City1).get(City2);
    } 
    
    
}
