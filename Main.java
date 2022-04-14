import java.util.Scanner;

class Main {
  
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int gridSize, totalShips, numberOfMissiles;
    String[] playerShipsPos = new String[2];
    String[] playerMissilesPos = new String[2];

    gridSize = scanner.nextInt();
    totalShips = scanner.nextInt();

    playerShipsPos[0] = scanner.nextLine();
    playerShipsPos[1] = scanner.nextLine();

    numberOfMissiles = scanner.nextInt();

    playerMissilesPos[0] = scanner.nextLine();
    playerMissilesPos[1] = scanner.nextLine();

    
    
    
  }
}