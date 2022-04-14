package models;

import java.util.*;

public class PlayerMap{

  private int gridSize;
  private int totalShip;
  List<Coordinate> battleshipPos;
  List<Coordinate> targetPos;
  

  public PlayerMap(int gridSize, int totalShip){
    this.gridSize = gridSize;
    this.totalShip = totalShip;
  }
  
  public void setGridSize(int gridSize){
    this.gridSize = gridSize;
  }
  
  public int getGridSize(){
    return gridSize;
  }

  public void setTotalShip(int totalShip){
    this.totalShip = totalShip;
  }
  
  public int getTotalShip(){
    return totalShip;
  }

  public void setBattleshipPos(List<Coordinate> pos){
    this.battleshipPos = pos;
  }
  
  public void setTargetPos(List<Coordinate> pos){
    this.targetPos = pos;
  }

  public List<Coordinate> getBattleshipPos(){
    return battleshipPos;
  }

  public List<Coordinate> getTargetPos(){
    return targetPos;
  }
  
}