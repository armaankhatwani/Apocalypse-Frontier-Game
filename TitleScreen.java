
import mayflower.*;
public class TitleScreen extends World
{
    private StartButton start = new StartButton("img/Button/playButtonHighlight.png","img/Button/playButton.png");
    private EndButton end = new EndButton("img/Button/exitButtonHighlight.png","img/Button/exitButton.png");
    public TitleScreen(){
        setBackground("img/BG/BG.png");
        addObject(start,25,300);
        start.scale(200,100);
        addObject(end,300,300);
        end.scale(200,100);
    }
    public void act(){

    }
}
