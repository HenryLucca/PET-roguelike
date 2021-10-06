package Characters;
import java.util.Random;

public abstract class Character {
	
	public Random aleat;
	
    public int life;
    public int attackPower;
    public int positionX;
    public int positionY;

    public abstract int getCharacterPositionX();

    public abstract int getCharacterPositionY();
    
    public abstract void setCharacterPosition(int positionX, int positionY);

    public abstract String toString();

}
