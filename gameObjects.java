import java.util.*;

class Player{
    private String name;
    private int playerNumber;
    private int money;
    
    public Player(String name){
        this.name = name;
        this.money = 1500;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public void addMoney(int amount){
        money += amount;
    }

    public void subMoney(int amount){
        money -= amount;
    }
}

class Property{
    private String name;
    private int cost;

    public Property(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }
}

public class monopolyGame {
    private List<Property> properties;
    private List<Player> players;
    private int currentPlayerIndex;

    public monopolyGame(){
        
    }
}
