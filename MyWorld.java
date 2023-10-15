import mayflower.*;


public class MyWorld extends World {
    private String[][] tiles;
    private Cat cat;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        Mayflower.showBounds(true);
        
        tiles = new String[6][8];
        buildWorld();
        
        showText("Score: "+cat.getScore()+" Lives: "+cat.getLives(), 10, 30, Color.BLACK);
    }
    
    public void act()
    {
        
    }
    
    public void buildWorld(){
        for(int r=0;r<tiles.length;r++){
            for(int c=0;c<tiles[r].length;c++){
                tiles[r][c] = "";
            }
        }
        
        for(int i=0;i<tiles[0].length;i++)
            tiles[5][i] = "ground";
            
        for(int r=0;r<tiles.length;r++){
            for(int c=0;c<tiles[r].length;c++){
                if(tiles[r][c].equals("ground")){
                    addObject(new Block(), c*100, r*100);
                }
            }
        }
        
        cat = new Cat();
        addObject(cat, 400, 100);
    }
}