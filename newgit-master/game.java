import Map.Map;
import Map.MapPosition;

import Characters.Friends.*;
import Characters.Enemys.*;
import Characters.*;
import Characters.Character;

public class game {
    public static void main(String[] args) {
    	       
    	Map map = new Map();
        criarCharacters(map);

        imprimeMapa(map.getMapPositions());
    }
    // Movimentação

    public static void imprimeMapa(MapPosition [][] map){
        for(int i = 0; i < map.length; i = i + 1){
            for(int j = 0; j < map.length; j = j + 1){
                System.out.format("%s", map[i][j]);
            }
            System.out.println();
        }
    }
    public static void criarCharacters(Map map){
        
        Character player = new Player();     
        map.addCharacterOnMap(player);

        Character monster1 = new Monster();
        map.addCharacterOnMap(monster1); 
        Character monster2 = new Monster();
        map.addCharacterOnMap(monster2); 
        Character monster3 = new Monster();
        map.addCharacterOnMap(monster3); 
        Character monster4 = new Monster();
        map.addCharacterOnMap(monster4); 
        Character monster5 = new Monster();
        map.addCharacterOnMap(monster5); 
        Character monster6 = new Monster();
        map.addCharacterOnMap(monster6);            

        Character boss = new Boss();
        map.addCharacterOnMap(boss);



        Character potion1 = new Potion();
        map.addCharacterOnMap(potion1);
        Character potion2 = new Potion();
        map.addCharacterOnMap(potion2);
        Character potion3 = new Potion();
        map.addCharacterOnMap(potion3);
        Character potion4 = new Potion();
        map.addCharacterOnMap(potion4);
        Character potion5 = new Potion();
        map.addCharacterOnMap(potion5);
        Character potion6 = new Potion();
        map.addCharacterOnMap(potion6);
        Character potion7 = new Potion();
        map.addCharacterOnMap(potion7);
        Character potion8 = new Potion();
        map.addCharacterOnMap(potion8);

        Character weapon = new Weapon();
        map.addCharacterOnMap(weapon);
 
    }
    
}