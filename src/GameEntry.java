public class GameEntry {
    private String name;
    private int score;
    String getName(){
        return name;
    }
    int getScore(){
        return score;
    }
    public GameEntry(String name,int score){
        this.name=name;
        this.score=score;
    }


    public String toString(){
        return "(" + name+"," + score +")";
    }


}
class Scoreboard{
    GameEntry[] scores;
    public Scoreboard(int size){
        scores=new GameEntry[size];
    }
}
class Game{
    public static void main(String[] args) {
        GameEntry g1=new GameEntry("harsh",720);
    }
}