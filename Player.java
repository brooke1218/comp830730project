package comp840project;

public class Player {
private static Player p = new Player( );

Player() { }

public static Player getInstance( ) {
   return p;
}
}
