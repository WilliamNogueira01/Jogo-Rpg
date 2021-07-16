
package jogo;

import jplay.GameObject;
import jplay.TileInfo;


public class Controle {
    public boolean colisao(GameObject obj, TileInfo tile){
        if(( tile.id > 02 && tile.id < 12 ||tile.id > 20 && tile.id < 82  )&& obj.collided(tile)){
            return true;
            
        }
        
        return false;
    }
    
}
