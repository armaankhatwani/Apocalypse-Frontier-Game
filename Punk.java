
import mayflower.*;
public class Punk extends Enemy
{
    
    public Punk(int s, int e, int y)
    {
        super(s,e,y);
        String[] frames = new String[6];
        for(int i=0;i<6;i++){
            frames[i] = "img/2 Punk/Punk_run/Punk_r"+i+".png";
        }
        Animation moveR = new Animation(100000000,frames); 
        
        Animation moveL = new Animation(100000000,frames);
        moveL.flipHorizontally();
        
        
        for(int i=0;i<6;i++){
            frames[i] = "img/2 Punk/Punk_attack/Punk_a"+i+".png";
        }
        Animation attackR = new Animation(100000000,frames); 
        
        Animation attackL = new Animation(100000000,frames);
        attackL.flipHorizontally();
        
        setMoveLAnimation(moveL);
        setMoveRAnimation(moveR);
        setAttackRAnimation(attackR);
        setAttackLAnimation(attackL);
    }

    public void act(){
        super.act(); 
    }
}
