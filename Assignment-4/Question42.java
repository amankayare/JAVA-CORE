/*
 * 42. Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a
 * rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed 
 * to cover the floor completely.
 * 
 */

class Tile {
    private int edgeLength;

    Tile() {
        edgeLength = 1; 
    }

    Tile(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    int getEdgeLength() {
        return edgeLength;
    }
}

class Floor {
    private int length;
    private int width;

    Floor() {
        length = 1;
        width = 1; 
    }

    Floor(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int totalTiles(Tile t) {
        int tilelength = t.getEdgeLength();
        int numberOfTiles = (length * width) / (tilelength * tilelength);
        return numberOfTiles;
    }
}


public class Question42 {
    
    public static void main(String[] args) {
        Tile t = new Tile(5);
        Floor f = new Floor(200, 20);
        System.out.println("The total number of tiles with length " + t.getEdgeLength() + " is " + f.totalTiles(t));
}


}