// Assignment Problem 1
interface Polygon {
    void calculateArea(int length, int breadth);
}
 
class Square implements Polygon {
    public void calculateArea(int side) {
        System.out.println("The area of the square is " + (side * side));
    }
}
 
class Main {
    public static void main(String[] args) {
        Square sq = new Square();       
        sq.calculateArea(10);
    }
}