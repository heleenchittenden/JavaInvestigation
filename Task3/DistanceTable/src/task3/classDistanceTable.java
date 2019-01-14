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
    
    HashMap<CitiesEnum, HashMap<CitiesEnum, Integer>> distanceMap = new HashMap<>();
    
    private Integer getDistance(CitiesEnum city1, CitiesEnum city2) {
        return distanceMap.get(city1).get(city2);
    } 
    
    private void setDistance(CitiesEnum city1, CitiesEnum city2, Integer distance) {
        distanceMap.put(city1, new HashMap(city2, distance));
    }
}
