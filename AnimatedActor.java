import mayflower.*;
public class AnimatedActor extends GravityActor
{
    private Animation animation;
    private Timer animationTimer;
    public AnimatedActor(){
        animationTimer = new Timer(1000);
    }
    public void setAnimation(Animation a){
       animation = a; 
    }
    public void act(){
        super.act();
        if(animationTimer.isDone() && animation!=null){           
            animationTimer.set(animation.getFramerate());
            MayflowerImage frame = animation.getNextFrame();
            setImage(frame);
        }
    }
}
