import java.util.*;

import models.*;

class Main {

  // public static int find(List<Integer> c, Integer element){
  //   for(int i=0; i<c.size(); i++){
  //     if(c.get(i)==element) return i;
  //   }
  // }
  
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int gridSize, totalShips, numberOfMissiles;
    String[] playerShipsPos = new String[2];
    String[] targetMissilePos = new String[2];

    gridSize = 5;
    // totalShips = scanner.nextInt();

    // playerShipsPos[0] = scanner.nextLine();
    // playerShipsPos[1] = scanner.nextLine();

    // numberOfMissiles = scanner.nextInt();

    // targetMissilePos[0] = scanner.nextLine();
    // targetMissilePos[1] = scanner.nextLine();

    //generate Map for each player
    // List<PlayerMap> playerMap = new ArrayList<>();

    // playerMap.add(new PlayerMap(gridSize, totalShips));
    // playerMap.add(new PlayerMap(gridSize, totalShips));

    // playerMap.get(0).setTotalShip(totalShips);
    // playerMap.get(1).setTotalShip(totalShips);

    // //set ship position
    // for(int i=0; i<2; i++){
    //   String[] tmpPos = playerShipsPos[i].split(":");
    //   List<Coordinate> coord = new ArrayList<>();
    //   for(String str : tmpPos){
    //     String[] pos = str.split(",");
    //     int x = Integer.valueOf(pos[0]);
    //     int y = Integer.valueOf(pos[1]);
    //     coord.add(new Coordinate(x, y));
    //   }
    //   playerMap.get(i).setBattleshipPos(coord);
    // }

    // for(int i=0; i<2; i++){
    //   String[] tmpPos = targetMissilePos[i].split(":");
    //   List<Coordinate> coord = new ArrayList<>();
    //   for(String str : tmpPos){
    //     String[] pos = str.split(",");
    //     int x = Integer.valueOf(pos[0]);
    //     int y = Integer.valueOf(pos[1]);
    //     coord.add(new Coordinate(x, y));
    //   }
    //   playerMap.get(i).setTargetPos(coord);
    // }

    // List<Integer> x = new ArrayList<>();
    // List<Integer> y = new ArrayList<>();

    // for(Coordinate c : playerMap.get(0).getBattleshipPos() ){
    //   x.add(c.getX());
    //   y.add(c.getY());
    // }

    Players player = new Players(5, 5);
    
    //print ships
    for(int i=0; i<gridSize; i++){
      for(int j=0; j<gridSize; j++){
       System.out.print(" _ ");
      }
      System.out.print("\n");
    }
    
    // for(int j=0; j<playerMap.get(0).getTargetPos().size(); j++){
    //   playerMap.get(0).getBattleshipPos();
    // }
     
    
    
    
    
  }
}