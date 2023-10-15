
import mayflower.*;
public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;
    public Animation(int f, String[] fileNames){
        framerate = f;
        frames = new MayflowerImage[fileNames.length];
        for(int i=0;i<frames.length;i++){
            frames[i] = new MayflowerImage(fileNames[i]);
        }
        currentFrame = 0;
    }
    
    public MayflowerImage[] getFrames(){
        return frames;
    }
    public int getFramerate(){
        return framerate;
    }
    public void resize(int w, int h){
        for(int i=0;i<frames.length;i++){
            frames[i].scale(w,h);
        }
    }
    public void changeTransparency(int percent){
        for(int i=0;i<frames.length;i++){
            frames[i].setTransparency(percent);
        }
    }
    public void flipHorizontally(){
        for(int i=0;i<frames.length;i++){
            frames[i].mirrorHorizontally();
        }
    }
    public void setBounds(int x, int y, int w, int h){
        for(int i=0;i<frames.length;i++){
            frames[i].crop(x,y,w,h);
        }
    }
    
    public MayflowerImage getNextFrame(){
        int temp = currentFrame;
        currentFrame++;
        return frames[temp%(frames.length)];
    }
}
