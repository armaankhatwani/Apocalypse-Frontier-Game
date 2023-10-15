
import mayflower.*;
public class Zombie extends Enemy
{
    public Zombie(int s, int e, int y)
    {
        super(s,e,y);
        String[] frames = new String[9];
        for(int i=0;i<9;i++){
            frames[i] = "img/6 Zombie/Zombie_run/Zombie_r"+i+".png";
        }
        Animation moveR = new Animation(50,frames); 
        
        Animation moveL = new Animation(50,frames);
        moveL.flipHorizontally();
        
        String[] framesA = new String[8];
        for(int i=0;i<8;i++){
            framesA[i] = "img/6 Zombie/Zombie_attack/Zombie_a"+i+".png";
        }
        Animation attackR = new Animation(50,frames); 
        
        Animation attackL = new Animation(50,frames);
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

