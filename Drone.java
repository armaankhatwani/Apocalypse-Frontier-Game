

public class Drone extends Turret
{
    public Drone(Cat cat, int ypos){
        super(cat);
        String[] frames = new String[8];
        for(int i=0;i<8;i++){
            frames[i] = "img/Drone/Idling/idle-"+i+".png";
        }
        Animation idleR = new Animation(100000000,frames);
        idleR.resize(800,50);
        
        Animation idleL = new Animation(100000000,frames);
        idleL.flipHorizontally();
        
        frames = new String[4];
        for(int i=0;i<4;i++){
            frames[i] = "img/Drone/Firing/fire-"+i+".png";
        }
        Animation fireR = new Animation(100000000,frames);
        
        Animation fireL = new Animation(100000000,frames);
        fireL.flipHorizontally();
        
        setIdleRightAnimation(idleR);
        setIdleLeftAnimation(idleL);
        setFireRightAnimation(fireR);
        setFireRightAnimation(fireL);
        setYPos(ypos);
    }
    
    public void act(){
        super.act();
        setAcceleration(0);
    }
}
