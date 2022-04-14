package models;

public class Map{

  private int gridSize;
  private int totalShip;
  
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
  
}