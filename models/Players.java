package models;

import java.util.*;

public class Players{

  int numberOfMissiles;
  int totalShip;
  int remainingShip;

  public Players(int totalShip, int numberOfMissiles){
    this.totalShip = totalShip;
    this.numberOfMissiles = numberOfMissiles;
  }

  public int getRemainingShip(){
    return remainingShip;
  }

  public void decrementShip(){
    remainingShip--;
  }

  
  
  
}